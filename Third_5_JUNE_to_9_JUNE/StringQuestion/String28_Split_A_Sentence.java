package Assigment.Third_5_JUNE_to_9_JUNE.StringQuestion;

public class String28_Split_A_Sentence {
    public static void main(String[] args) {
        String st="Write a program to split a sentence into individual words and display them.";

          String st1[]=st.split(" +");

          for (String s:st1){
              System.out.println(s);
          }

    }
}
