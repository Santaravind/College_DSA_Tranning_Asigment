package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Q45_Find_First_Non_Repeated_Character {
    public static void main(String[] args) {

        String st="swiss";
//        String st="aravind";
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();

        for (int i=0; i<st.length(); i++){
            map.put(st.charAt(i),map.getOrDefault(st.charAt(i),0)+1);
        }

        for(char c: map.keySet()){
            if (map.get(c)==1){
                System.out.println(c);
                break;
            }
        }

    }
}
