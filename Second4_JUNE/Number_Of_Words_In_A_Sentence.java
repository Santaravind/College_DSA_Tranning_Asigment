package Assigment.Second4_JUNE;

public class Number_Of_Words_In_A_Sentence {
    public static void main(String[] args) {
        String st="Write a Java program    to count the number of words in a sentence.";

        String s[]=st.split(" +");
        System.out.println("Number of word in sentence : "+ s.length);


        //Without using in build function
        int count=0;
        for (int i=0; i<st.length(); i++){
            if (st.charAt(i)==' '){
                count++;
            }
        }
        System.out.println( "Without using in build function \n "+ "Number of word in sentence : " + (count+1));
    }
}
