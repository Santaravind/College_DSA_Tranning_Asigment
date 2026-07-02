package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class Q75_Sort_HashMap {
    public static void main(String[] args) {
        HashMap<Character,Integer>map=new HashMap<>();
        map.put('a',8);
        map.put('b',2);
        map.put('c',5);
        Map<Integer,Character>tree=new TreeMap<>();
        for (Map.Entry<Character,Integer>entry:map.entrySet()){
            tree.put(entry.getValue(),entry.getKey());
        }


//        HashMap<Character,Integer>map2=new HashMap<>();
        for (Map.Entry<Integer,Character>entry:tree.entrySet()){
            System.out.println(entry.getValue()+ " "+entry.getKey());
        }


//        System.out.println(tree);
    }
}
