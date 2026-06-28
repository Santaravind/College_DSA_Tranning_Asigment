package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.TreeMap;

public class Q57_Find_First_and_Last_Key {
    public static void main(String[] args) {
        TreeMap<Character,Integer> map=new TreeMap<>();
        map.put('a',2);
        map.put('d',2);
        map.put('c',5);
        map.put('b',6);

        System.out.println("First "+ map.firstKey());
        System.out.println("Last :"+map.lastKey());
    }
}
