package Assigment.Third_5_JUNE_to_9_JUNE.ArraysQuestion;

public class Arrays52_Smallest_Element {
    public static void main(String[] args) {
        int arr[]={23,2,11,4,56,4,33,45,4};
        int min=arr[0];

        for (int i=1; i<arr.length; i++){
            min=Math.min(min,arr[i]);
        }

        System.out.println("Array Smallest Element :  " + min);
    }
}
