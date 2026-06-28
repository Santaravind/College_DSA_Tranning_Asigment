package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.ArrayList;
import java.util.List;

public class Q_74_Binary_Search {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList(List.of(4,5,3,2,6,7));
        int target=6;
        boolean found=false;
        for (int v:list){
            if (target==v){
                 found=true;
            }
        }

        if (found){
            System.out.println("Element found into list");
        }else  System.out.println("Element not found into list");
    }
}
