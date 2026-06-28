package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Q48_Find_Subarray_Sum {
    public static void main(String[] args) {
        int[] arr ={1, 2, 3, 4, 5};
//        ArrayList<Integer>list=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        int target=9;
        int sum=0;

           int start=-1;
           int end=-1;
           for (int i=0; i<arr.length; i++){
               sum+=arr[i];
               if (sum-target==0){
                   start=0;
                   end=i;
                   break;
               }
               if (map.containsKey(sum-target)){
                   start=map.get(sum-target)+1;
                   end=i;
                   break;
               }
               map.put(sum,i);
           }

           if (start==-1){
               System.out.println("not found");
           }else     System.out.println(Arrays.toString(Arrays.copyOfRange(arr, start, end + 1)));

    }
}
