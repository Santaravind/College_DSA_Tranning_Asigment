package Assigment.Third_5_JUNE_to_9_JUNE.ArraysQuestion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Arrays67_Duplicate_Elements {
    public static void main(String[] args) {
        int arr[]={ 4,3,2,4,6,7,7,7,8};
        Set<Integer> st =new HashSet<>();
        Arrays.sort(arr);

        for (int i=0; i<arr.length-1; i++){
            if (arr[i]==arr[i+1]){
                st.add(arr[i]);
            }
        }
        System.out.println("Duplicate  element in arrays : " + st );
    }
}
