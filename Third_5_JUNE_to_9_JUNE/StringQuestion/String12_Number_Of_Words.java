package Assigment.Third_5_JUNE_to_9_JUNE.StringQuestion;

public class String12_Number_Of_Words {
    public static void main(String[] args) {
        String st="   Write a program to   count the total number of words in a sentence . ";

        String s[]=st.trim().split(" +");
        int n=s.length;

        System.out.println("Number of word in Sting :\t"+n);
    }
}
