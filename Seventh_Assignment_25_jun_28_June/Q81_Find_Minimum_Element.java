package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q81_Find_Minimum_Element
{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(List.of(10, 20, 5, 30, 15));

        System.out.println("Min element : "+ Collections.min(list));
    }
}
