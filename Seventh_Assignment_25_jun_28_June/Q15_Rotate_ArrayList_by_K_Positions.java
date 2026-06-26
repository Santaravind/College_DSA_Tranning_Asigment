package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.ArrayList;
import java.util.List;

public class Q15_Rotate_ArrayList_by_K_Positions {
    public static void rotate(Integer arr[], int start, int end){
        while (start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }

    }
    public static void main(String[] args) {
        ArrayList<Integer> ls=new ArrayList<>(List.of(1, 2, 3, 4, 5));
        int position=2;
        Integer arr[]=ls.toArray(new Integer[0]);

        rotate(arr,0,arr.length-1);
        rotate(arr,0,position-1);
        rotate(arr, position,arr.length-1);
        ls=new ArrayList<>(List.of(arr));
        System.out.println(ls);

    }
}
