package Assigment.Third_5_JUNE_to_9_JUNE.StringQuestion;

public class String41_Reverse_Words_Sentence {
    public static void main(String[] args) {
//        String st="String reverse words sentence";
        String st="Write a program to reverse the order of words in a sentence";

        String s[]=st.split(" +");

        System.out.println("Reverse Words : ");
        for(int i=s.length-1; i>=0; i--){
            System.out.print(s[i]+" ");
        }
    }
}
