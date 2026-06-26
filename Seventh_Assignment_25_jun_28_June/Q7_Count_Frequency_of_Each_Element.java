package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Q7_Count_Frequency_of_Each_Element {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(List.of(1, 2, 2, 3, 3, 3, 4));
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i=0; i<list.size(); i++){
            if (map.containsKey(list.get(i))){
                map.put(list.get(i),map.get(list.get(i))+1);
            }
            map.put(list.get(i),1 );
        }
        System.out.println(map);
    }
}
