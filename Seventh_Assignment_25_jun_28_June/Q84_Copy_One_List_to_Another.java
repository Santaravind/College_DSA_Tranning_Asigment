package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.ArrayList;
import java.util.List;

public class Q84_Copy_One_List_to_Another {
    public static void main(String[] args) {
        List<Integer>list1=new ArrayList<>(List.of(1,2,3,4));
        List<Integer>list2 =new ArrayList<>(List.of(6));
        System.out.println(list2);
        list2.addAll(list1);
        System.out.println(list2);
    }
}
