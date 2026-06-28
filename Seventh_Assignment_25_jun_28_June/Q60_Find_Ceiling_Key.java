package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.TreeMap;

public class Q60_Find_Ceiling_Key {
    public static void main(String[] args) {
        TreeMap<String,Integer> map=new TreeMap<>();
        map.put("a",2);
        map.put("b",2);
        map.put("c",5);
        map.put("d",6);

        String target="bb";

        System.out.println(map.ceilingKey(target));
    }
}
