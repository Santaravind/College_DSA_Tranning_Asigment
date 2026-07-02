package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.*;

public class Q68_Reverse_First_K_Elements_of_Queue {
//    public static void reverse(Integer arr[], int start, int end){
//        while (start<end){
//            int temp=arr[start];
//            arr[start]=arr[end];
//            arr[end]=temp;
//            start++;
//            end--;
//        }
//    }
    public static void main(String[] args) {
        Queue<Integer>queue=new LinkedList(List.of(1,2,3,4,5,6));
        Stack<Integer>stack= new Stack<>();
        int k=3;
        int j=0;
        System.out.println(queue);


//        Integer arr[]=queue.toArray(new Integer[0]);
//        int start=0;
//        int end=arr.length-1;
//
//
//        reverse(arr,start,end);
//        reverse(arr,start,k-1);
//        reverse(arr,k,end);

//        Queue<Integer> queue2=new LinkedList<>(List.of(arr));
        Queue<Integer> queue3=new LinkedList<>();
//        List<Integer>list= new ArrayList<>(queue);
        //remove first k element 

        for (int i = 0; i < k; i++) {
            stack.push(queue.poll());
        }
        while (!stack.isEmpty()){
            queue3.add(stack.pop());
        }
        for (int i=0; i<queue.size(); i++){
            queue3.add(queue.poll());
        }
        System.out.println(queue3);
//        System.out.println(queue2);

    }
}
