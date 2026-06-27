package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.LinkedList;
import java.util.List;

public class Q25_Merge_Two_Sorted_LinkedLists {
    public static void main(String[] args) {
        LinkedList<Integer>list1=new LinkedList(List.of(1,3,4,8));
        LinkedList<Integer>list2=new LinkedList<>(List.of(2,5,6,9));

         LinkedList<Integer>list=new LinkedList<>();
        int n=list1.size();
        int m=list2.size();
        int i=0,j=0;
        while (i<n&&j<m){
            if (list1.get(i)<list2.get(j)){
                list.add(list1.get(i));
                i++;
            }else {
                list.add(list2.get(j));
                j++;
            }
        }
        while (j<m) {
            list.add(list2.get(j));
            j++;
        }
        while (i<n)
             {
                 list.add(list1.get(i));
                 i++;
            }

        System.out.println("Merge two sorted linked List : " +list);
    }
}
