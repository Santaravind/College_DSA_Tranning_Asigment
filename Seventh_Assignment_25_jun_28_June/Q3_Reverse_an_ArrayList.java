package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q3_Reverse_an_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList(List.of(1, 2, 3, 4, 5));

         Integer arr[]=list.toArray(new Integer[0]);

         int left=0; int right=arr.length-1;
         while (left<right){
             int temp=arr[left];
             arr[left]=arr[right];
             arr[right]=temp;
             left++;
             right--;
         }
        list=new ArrayList<>(List.of(arr));
        System.out.println(list);

//        for (int i=list.size()-1 ; i>=0;  i--){
//            System.out.print(list.get(i)+ " ");
//        }
    }
}
