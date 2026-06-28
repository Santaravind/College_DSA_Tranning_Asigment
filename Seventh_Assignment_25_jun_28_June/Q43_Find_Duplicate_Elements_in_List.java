package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q43_Find_Duplicate_Elements_in_List {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>(List.of(1, 2, 2, 3, 4, 4, 5));
        ArrayList<Integer>list1=new ArrayList<>();

        HashMap<Integer,Integer>map=new HashMap<>();
        for(int v:list){
            map.put(v,map.getOrDefault(v,0)+1);
        }

        for (int n : map.keySet()){
            if (map.get(n)==2){
                list1.add(n);
            }
        }

//         System.out.println(map.keySet());

        System.out.println(list1);
    }
}
