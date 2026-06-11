package Assigment.Third_5_JUNE_to_9_JUNE.ArraysQuestion;

import java.util.ArrayList;
import java.util.List;

public class Arrays74_Union_Of_Twoarrays {
    public static void main(String[] args) {
        int arr1[]={34,5,6,4,35,3};
        int arr2[]={45,6,76,7,34,2};

        List<Integer> ls=new ArrayList<>();

        int i=0;
        while(i<arr1.length){
             ls.add(arr1[i]);
             int j=0;
             while (j<arr2.length){
                 if (!ls.contains(arr2[j])){
                     ls.add(arr2[j]);
                 }
                 j++;
             }
            i++;
        }

        System.out.println("Unique of two arrays : " + ls);
    }
}
