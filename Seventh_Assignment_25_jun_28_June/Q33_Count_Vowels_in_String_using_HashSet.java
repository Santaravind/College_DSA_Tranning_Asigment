package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.HashSet;
import java.util.List;

public class Q33_Count_Vowels_in_String_using_HashSet {
    public static void main(String[] args) {
        HashSet<Character> set=new HashSet(List.of('a','i','u','o','e','A','E','I','O','U'));
        String st="Hello world";
  int count =0;
        for (int i=0; i<st.length(); i++){
//            if (st.charAt(i)=='a'||st.charAt(i)=='e'||st.charAt(i)=='i'||st.charAt(i)=='o'||st.charAt(i)=='u'||st.charAt(i)=='A'||st.charAt(i)=='E'||st.charAt(i)=='I'||st.charAt(i)=='O'||st.charAt(i)=='U'){
//                set.add(st.charAt(i));
//            }
            if (set.contains(st.charAt(i)))count++;
        }

        System.out.println("Number of vowel in string : "+ count);
    }
}
