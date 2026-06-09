package Assigment.Third_5_JUNE_to_9_JUNE.ArraysQuestion;

public class Arrays56_Second_Smallest_Element {
    public static void main(String[] args) {
        int arr[]={23,34,2,1,34,67,89};
        int min=arr[0];
        int minS=0;

        for (int i=0; i<arr.length; i++){
            if (min>arr[i]){
                minS=min;
                min=arr[i];
            }
        }
        System.out.println("Second Smallest element : "+ minS);
    }
}
