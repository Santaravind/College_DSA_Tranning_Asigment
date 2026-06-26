package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.ArrayList;
import java.util.List;

public class Q9_Find_Sum_of_All_Elements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, 30, 40));
        int sum = 0;
        for (int v:list){
            sum+=v;

        }

        System.out.println("Sum of Element : " +sum);

    }
}
