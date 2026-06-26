package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q11_Remove_Elements_Greater_Than_Threshold {
    public static void main(String[] args) {
        ArrayList<Integer>ls=new ArrayList<>(List.of(10, 25, 15, 30, 5));
        int threshold = 20;

        Iterator<Integer> val= ls.iterator();

        while (val.hasNext()){
            if (val.next()>threshold){
                val.remove();
            }
        }

        System.out.println(ls);
    }
}
