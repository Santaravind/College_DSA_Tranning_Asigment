package Assigment.Third_5_JUNE_to_9_JUNE.ArraysQuestion;

public class Arrays58_Reverse_Order_without_Modifying_Array {
    public static void main(String[] args) {
        int arr[]={4,5,3,2,6,7,8,96,3,23,9};

        System.out.println("Arrays in revers order :\t");
        for(int i=arr.length-1; i>=0 ; i--){
            System.out.print( arr[i]+" ");
        }
    }
}
