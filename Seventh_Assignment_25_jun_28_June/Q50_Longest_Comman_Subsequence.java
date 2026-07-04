package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.HashMap;

public class Q50_Longest_Comman_Subsequence {
    public static void main(String[] args) {
//        String st="abcabcd";
        String st="abcabcbb";

        int j=0, i=0;
        int ans=Integer.MIN_VALUE;
        HashMap<Character,Integer>map=new HashMap<>();

        while (j<st.length()){
            map.put(st.charAt(j),map.getOrDefault(st.charAt(i),0)+1);

            if (map.size()==(j-i+1)){
                ans=Math.max(ans,(j-i+1));
                j++;
            }else if(map.size()<(j-i+1)){
                while (map.size()<(j-i+1)) {
                    map.put(st.charAt(i), map.get(st.charAt(i)) - 1);
                    if (map.get(st.charAt(i))==0){
                        map.remove(st.charAt(i));
                    }
                    i++;
                }
                j++;
            }
        }

        System.out.println("Largest subsequence of String without repeating character :  " + ans);

    }
}
