package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.Deque;
import java.util.LinkedList;

public class Q64_Find_Maximum_in_Sliding_Window {
    public static void main(String[] args) {
        int arr[]={1, 3, -1, -3, 5, 3, 6, 7};
        int k=3;
        Deque<Integer>list=new LinkedList<>();
        Deque<Integer>list2=new LinkedList<>();
        int j=0;
        int i=0;
        int maxP=Integer.MIN_VALUE;
        while (j<arr.length){
            list.add(arr[j]);
             if ((j-i+1)<k){
                 j++;
             }
             else if((j-i+1 )==k){
             maxP=Math.max(list.poll(),list.peek());
             maxP=Math.max(maxP,list.pollLast());
               list2.add(maxP);
               list.add(arr[j]);
               j++;
               i++;
//             list.stream().max((a, b)->a>b?a:b).stream().toList();
             }

        }
        System.out.println(list2);
    }
}
