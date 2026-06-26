package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q1_Remove_Duplicates_from_ArrayList {
    public static void main(String[] args) {

        int arr[]={1, 2, 3, 2, 4, 1, 5};
        List<Integer> ls=new ArrayList<>();
       for (int i=0; i<arr.length; i++){
           if (!ls.contains(arr[i])){
                ls.add(arr[i]);
           }
       }

        System.out.println("Without  Duplicates : " + ls);


    }
}
