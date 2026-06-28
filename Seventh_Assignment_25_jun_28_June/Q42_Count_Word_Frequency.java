package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.HashMap;

public class Q42_Count_Word_Frequency {
    public static void main(String[] args) {
        String st="hello world hello java world";

        String s[]=st.split(" +");

        HashMap<String ,Integer>map=new HashMap<>();
        for (int i=0; i<s.length; i++){
            map.put(s[i],map.getOrDefault(s[i],0)+1);
        }

        System.out.println(map);

    }
}
