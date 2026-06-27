package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.HashSet;
import java.util.List;

public class Q32_Check_if_Set_is_Subset_of_Another {
    public static void main(String[] args) {
        HashSet<Integer>set1=new HashSet(List.of(1,2,3,4));
        HashSet<Integer>set2=new HashSet<>(List.of(1,2,3,4,5,6));

        int count=0;
        for (int n:set2){
            if (set1.contains(n)){
                count++;
            }
        }

        if (count==set1.size()){
            System.out.println("Set1 is subset of set2 " + true);
        }else {
            System.out.println(false);
        }




    }
}
