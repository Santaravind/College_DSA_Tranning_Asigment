package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.*;


public class Q75_Sort_HashMap {
    public static void main(String[] args) {
        HashMap<Character,Integer>map=new HashMap<>();
        map.put('a',8);
        map.put('b',2);
        map.put('c',5);
//        Map<Integer,Character>tree=new TreeMap<>();
//        for (Map.Entry<Character,Integer>entry:map.entrySet()){
//            tree.put(entry.getValue(),entry.getKey());
//        }

        HashMap<Character,Integer>map2=new HashMap<>();
        map2.put('a',3);
        map2.put('b',1);
        map2.put('c',2);
        ArrayList<Map.Entry<Character,Integer>> list=new ArrayList<>(map2.entrySet());
//      This is also work
//       list.sort((a,b)->Integer.compare(b.getValue(),a.getValue()));
//        list.sort((a,b)->b.getValue()-a.getValue());

        list.sort(Map.Entry.comparingByValue(Collections.reverseOrder()));

        System.out.println(list);
        
    }
}
