package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.HashMap;

public class Q55_Replace_Value_for_Specific_Key {
    public static void main(String[] args) {
        HashMap<Character,Integer>map=new HashMap<>();
        map.put('a',10);
        map.put('b',3);
        map.put('c',30);
        System.out.println(map);
         int newValue=20;
         map.put('b',newValue);
        System.out.println(map);


    }
}
