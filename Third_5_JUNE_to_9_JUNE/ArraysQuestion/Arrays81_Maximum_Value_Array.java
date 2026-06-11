package Assigment.Third_5_JUNE_to_9_JUNE.ArraysQuestion;

public class Arrays81_Maximum_Value_Array {
    public static void main(String[] args) {
        int arr[]={23,2,1,4,56,4,33,45,4};
        int max=arr[0];

        for (int i=1; i<arr.length; i++){
            max=Math.max(max,arr[i]);
        }

        System.out.println("Array Maximum Element :" + max);
    }
}
