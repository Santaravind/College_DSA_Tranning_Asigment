package Assigment.Third_5_JUNE_to_9_JUNE.ArraysQuestion;

import java.sql.SQLOutput;

public class Arrays75_Rotate_An_Array {
    public static void main(String[] args) {
        int arr[]= {34,4,5,3,2,5};
        int temp=arr[0];

        for (int i=0; i<arr.length-1; i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
        System.out.println("One value Left Rotation : ");
        for (int b: arr){
            System.out.print(b+" ");
        }
    }
}
