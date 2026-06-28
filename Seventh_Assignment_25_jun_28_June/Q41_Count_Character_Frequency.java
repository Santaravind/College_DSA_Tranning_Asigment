package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.HashMap;

public class Q41_Count_Character_Frequency {
    public static void main(String[] args) {
        String st="hello";
        HashMap<Character,Integer>map=new HashMap<>();

        for (int i=0 ;i<st.length(); i++){
            map.put(st.charAt(i),map.getOrDefault(st.charAt(i),0)+1);
//            if (map.containsKey(st.charAt(i))){
//                map.put(st.charAt(i),map.getOrDefault(st.charAt(i),0)+1);
//            }
//            map.put(st.charAt(i),1);
        }

        System.out.println(map);
    }
}
