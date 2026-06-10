package Assigment.Third_5_JUNE_to_9_JUNE.ArraysQuestion;

public class Arrays63_Number_Of_Even_Elements {
    public static void main(String[] args) {

        int arr[]={34,4,5,6,7,8,9,5,43,78,90};
        int count=0;

        for (int i=0; i<arr.length; i++){
            if (arr[i]%2==0){
                count ++;
            }
        }

        System.out.println("Number of Even number in arrays  :" + count);
    }
}
