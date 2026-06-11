package Assigment.Third_5_JUNE_to_9_JUNE.ArraysQuestion;

import java.util.ArrayList;
import java.util.List;

public class Arrays80_Separate_Even_Odd_Numbers {
    public static void main(String[] args) {
        int arr[]={23,45,3,2,43,56,6,3,23,90};

        List<Integer>even=new ArrayList<>();
        List<Integer>odd=new ArrayList<>();

        for (int i=0; i<arr.length; i++){
            if (arr[i]%2==0){
                even.add(arr[i]);
            } else if (arr[i]%2!=0) {
                odd.add(arr[i]);
            }
        }

        System.out.println("Even arrays elements : " + even);
        System.out.println("Odd arrays elements : " + odd);
    }
}
