package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.TreeMap;

public class Q58_Get_All_Keys_in_Sorted_Order {
    public static void main(String[] args) {
        TreeMap<Character,Integer> map=new TreeMap<>();
        map.put('m',2);
        map.put('d',2);
        map.put('e',5);
        map.put('x',6);

        System.out.println("Sored keys in map : "+map.keySet());
    }
}
