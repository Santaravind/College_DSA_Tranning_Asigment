package Assigment.Third_5_JUNE_to_9_JUNE.StringQuestion;

public class String43_Shortest_Word_In_Sentence {
    public static void main(String[] args) {
        String st="  shortest word in a sentence";

        String st1[]=st.trim().split(" +");
        int min=st1[0].length();
        int m=0;
        for (int i=1; i<st1.length; i++){
            if (min>st1[i].length()){
                min=st1[i].length();
                m=i;
            }
        }

        System.out.println("The shortest word in sentence : "+st1[m]);
    }
}
