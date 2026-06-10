package Assigment.Third_5_JUNE_to_9_JUNE.ArraysQuestion;

import java.util.Arrays;

public class Arrays68_Remove_Duplicate_Value {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,4,3,2,6,7,8,9};

//        Arrays.sort(arr);

        for (int i=0; i<arr.length; i++){
            int n=arr[i];
            for (int j=i+1; j<arr.length; j++){
                if (n==arr[j]){
                    arr[j]=0;
                }
            }

        }

        for (int v :arr){
            System.out.print(v +" ");
        }
    }
}
