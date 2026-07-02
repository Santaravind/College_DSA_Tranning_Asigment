package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.ArrayList;
import java.util.List;

public class Q14_Merge_Two_Sorted_ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList(List.of(1, 3, 5,7,11,90,100));
        ArrayList<Integer>list1=new ArrayList<>(List.of(2, 4, 6,9,10,67));
        ArrayList<Integer>ls=new ArrayList<>();
        int i=0; int j=0;
        while (i<list.size()&&j<list1.size()){
            if (list.get(i)<list1.get(j)){
                ls.add(list.get(i));
                i++;
            }else {
                ls.add(list1.get(j));
                j++;
            }
        }

         while (i<list.size()){
             ls.add(list.get(i));
             i++;
         }
         while (j<list1.size()){
             ls.add(list1.get(j));
             j++;
         }
        System.out.println(ls);
    }
}
