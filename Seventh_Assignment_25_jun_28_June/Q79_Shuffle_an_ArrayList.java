package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q79_Shuffle_an_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>(List.of(3, 1, 3, 5, 4));

        System.out.println("Before: "+list);
//        Collections.rotate(list,3);
        Collections.shuffle(list);
        System.out.println("After : "+list);

    }
}
