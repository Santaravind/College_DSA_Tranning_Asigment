package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q82_Synchronize_an_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>(List.of(1,2,3,4,2,15,6));

        System.out.println("Can syncronize list : " +list);
        List<Integer>synconiselist= Collections.synchronizedList(list);

    }
}
