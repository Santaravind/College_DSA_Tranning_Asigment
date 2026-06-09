package Assigment.Third_5_JUNE_to_9_JUNE.ArraysQuestion;

public class Arrays53_Sum_Of_All_Elements {
    public static void main(String[] args) {
        int arr[]={2,2,1,4,6,4,3,4,4};
        int sum=0;

        for (int i=1; i<arr.length; i++){
            sum+=arr[i];
        }

        System.out.println("Array Smallest Element :  " + sum);
    }
}
