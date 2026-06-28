package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q54Get_All_Keys_and_Values {
    public static void main(String[] args) {
        HashMap<Character,Integer>map=new HashMap<>();
        map.put('a',1);
        map.put('b',4);
        map.put('c',3);

        List<Character>list1=new ArrayList<>();
        List<Integer>list=new ArrayList<>();

        for (char ch:map.keySet()){
            list.add(map.get(ch));
            list1.add(ch);
        }

        System.out.println("Keys :" + list1+"\nValues: "+ list);
    }
}
