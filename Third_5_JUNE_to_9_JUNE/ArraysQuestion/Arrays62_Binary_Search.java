package Assigment.Third_5_JUNE_to_9_JUNE.ArraysQuestion;

import java.util.Arrays;

public class Arrays62_Binary_Search {
    public static void main(String[] args) {
        int arr[]={23,24,45,67,89,90};
        int  k=4;
//        Arrays.sort(arr);//n
        int start=0;
        int end=arr.length-1;


        while(start<=end){
            int mid=start+(end-start)/2;

            if (arr[mid]==k){
                System.out.println("Value exist in array  at index "+mid);
                return;
            }
            if(arr[mid]<k){
                start=mid+1;
            }else {
                end=mid-1;
            }

        }

        System.out.println("Value is not found ");
    }
}
