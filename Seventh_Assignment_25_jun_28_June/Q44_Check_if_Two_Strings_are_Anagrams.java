package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.HashMap;

public class Q44_Check_if_Two_Strings_are_Anagrams {
    public static void main(String[] args) {
        String  str1 = "listen", str2 = "silent";
        HashMap<Character,Integer>map=new HashMap<>();
        HashMap<Character,Integer>map2=new HashMap<>();

        for (int i=0; i<str1.length(); i++){
            map.put(str1.charAt(i),map.getOrDefault(str1.charAt(i),0)+1);
        }
        for (int i=0; i<str2.length(); i++){
            map.put(str1.charAt(i),map.getOrDefault(str1.charAt(i),0)+1);
        }
    boolean isAnnagrams=false;
        for (int v:map.keySet()){
            if (map.get(v)!=map.get(v)){
                isAnnagrams=true;
            }
        }
          if (isAnnagrams){
              System.out.println(false);
          }else System.out.println(true);


    }
}
