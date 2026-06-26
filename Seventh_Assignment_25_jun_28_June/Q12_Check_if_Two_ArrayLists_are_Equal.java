package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.ArrayList;
import java.util.List;

public class Q12_Check_if_Two_ArrayLists_are_Equal {
    public static void main(String[] args) {
        ArrayList<Integer>ls=new ArrayList(List.of(1,2,3));
        ArrayList<Integer>list=new ArrayList<>(List.of(1,2,3));

        System.out.println(list.equals(ls));
    }
}
