package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.*;

public class Q47_Group_Anagrams_Together {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>(List.of("eat", "tea", "tan", "ate", "nat", "bat"));

        HashMap<String, List<String>> map = new HashMap<>();

        for (String st:list){
            char[] chars = st.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(st);
        }
        List<List<String >>result=new ArrayList<>(map.values());
//        System.out.println(list.contains(list.get(2)));
//        System.out.println(list.get(0).equals(list.get(1)));
        System.out.println(result);
    }
}
