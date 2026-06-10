package Assigment.Third_5_JUNE_to_9_JUNE.ArraysQuestion;

public class Arrays65_How_Many_Given_Time_Element_Appears {
    public static void main(String[] args) {
        int arr[]={12,2,3,4,5,1,4,5,6,3,2,3,4,5,};
        int count=0;
        int element=4;

        for (int i=0; i<arr.length; i++){
            if (arr[i]==element){
                count++;
            }
        }

        System.out.println("Total appear in "+ element + " in array :  "+ count);


    }
}
