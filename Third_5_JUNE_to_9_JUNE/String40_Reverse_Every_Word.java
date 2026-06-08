package Assigment.Third_5_JUNE_to_9_JUNE;

public class String40_Reverse_Every_Word {
    public static String reverEveryWord(String s){
        char ch[]=new char[s.length()];
        int n=s.length()-1;
        for (int i=0; i<s.length(); i++ ){
            ch[i]=s.charAt(n-i);
        }
        return String.valueOf(ch);
    }

    public static void main(String[] args) {
        String st="Write a program to reverse every word in a sentence without changing the word order";

        String s1[]=st.split(" +");
        for (int i=0; i<s1.length; i++){
            String st2=reverEveryWord(s1[i]);
            System.out.print(st2+" ");
        }

    }
}
