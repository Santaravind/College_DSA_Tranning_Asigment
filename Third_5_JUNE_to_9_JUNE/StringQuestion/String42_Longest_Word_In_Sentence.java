package Assigment.Third_5_JUNE_to_9_JUNE.StringQuestion;

public class String42_Longest_Word_In_Sentence {
    public static void main(String[] args) {
        String st="Write a program to find the longest word in a sentence";

        String st1[]=st.split(" +");
        int max=st1[0].length();
        int m=0;
        for (int i=1; i<st1.length; i++){
            if (max<st1[i].length()){
                max=st1[i].length();
                m=i;
            }
        }

        System.out.println(" The Longest word in a sentence : "+ st1[m]);

    }
}
