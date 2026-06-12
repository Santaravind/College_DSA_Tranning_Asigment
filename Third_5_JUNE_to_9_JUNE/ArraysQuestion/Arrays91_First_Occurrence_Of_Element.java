package Assigment.Third_5_JUNE_to_9_JUNE.ArraysQuestion;

import java.util.HashSet;
import java.util.Set;

public class Arrays91_First_Occurrence_Of_Element {
    public static void main(String[] args) {
        int arr[]={23,23,4,5,6,7,8,7,9,2,9};


        //this for all element first occurrence
//        Set<Integer> st=new HashSet<>();
//        for (int i=0; i<arr.length; i++){
//            if (!st.contains(arr[i])){
//                st.add(arr[i]);
//                System.out.print("Element : "+arr[i] + " first occurrence index  : " + i );
//            }
//            System.out.println(" ");
//        }



        //this for given ;
        int element=9;
        for (int i=0; i<arr.length; i++){
            if (arr[i]==element){
                System.out.println("The First occur of element  : "+ arr[i] + " index "+ i);
                return;
            }
        }

    }
}
