package Assigment.Third_5_JUNE_to_9_JUNE.ArraysQuestion;

public class Arrays93_Count_Occurenc_Of_Particular_Element {
    public static void main(String[] args) {
        int arr[]={3,4,5,4,3,23,25,67,89,4,3,2,3};
        int element=3;
        int count=0;
        for(int i=0; i< arr.length; i++){
            if(arr[i]==element){
                count ++;
            }
        }

        if (count==0){
            System.out.println("Element is not Exist : ");
        }else {
            System.out.println("Element  "+ element + " occurrence At  : "+count  +" times.");

        }



    }
}
