package Assigment.Third_5_JUNE_to_9_JUNE.ArraysQuestion;

import java.util.ArrayList;
import java.util.List;

public class Arrays94_Unique_Elements_In_Array {
    public static void main(String[] args) {
        int arr[]={1 ,2 ,3 ,2, 4, 5, 1, 6};
//        int arr[]={ 7, 7 ,7 ,7 ,7};
//        Example 1:
//        Enter number of elements: 8
//        Enter array elements:
//        1 2 3 2 4 5 1 6
//        Unique elements are:
//        3 4 5 6
//
//        Example 2:
//        Enter number of elements: 5
//        Enter array elements:
//        7 7 7 7 7
//        No unique elements found


        List<Integer> ls2=new ArrayList<>();
//        for (int i=0;i<arr.length; i++){
//            if (ls.contains(arr[i])){
//                ls.remove(Integer.valueOf(arr[i]));
//            }else {
//                ls.add(arr[i]);
//            }
//
//        }

         for (int i=0; i<arr.length; i++){
             int ch=arr[i];
           int   count=0;
             for (int j=0; j<arr.length; j++){
                 if (ch==arr[j]){
                     count++;
                 }
             }
             if (count==1){
                 ls2.add(ch);
             }
         }




        if (ls2.size()!=0) System.out.println( "Unique Element in arrays  "+ls2);
        else System.out.println("No unique value in java");
    }
}
