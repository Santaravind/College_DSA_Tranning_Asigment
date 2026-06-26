package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.ArrayList;
import java.util.List;

public class Q10_Find_Maximum_and_Minimum {
    public static void main(String[] args) {
        ArrayList<Integer>ls=new ArrayList<>(List.of(5, 3, 8, 1, 9, 2));
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for (int v: ls){
            max=Math.max(max,v);
            min=Math.min(min,v);

        }

        System.out.println("Maximum is: "+ max+"\nMinimum is : "+min);
    }
}
