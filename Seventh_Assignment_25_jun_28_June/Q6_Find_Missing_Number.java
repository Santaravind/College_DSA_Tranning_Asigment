package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q6_Find_Missing_Number {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>(List.of(1, 2, 4, 5, 6));
        Collections.sort(list);

        int n=list.get(list.size()-1);

        for (int i=1; i<n; i++){
            if (!list.contains(i)){
                System.out.println("Missing Number : "+ (i));
            }
        }
    }
}
