package Assigment.Third_5_JUNE_to_9_JUNE.StringQuestion;

public class String2_Separate_Line {
    public static void main(String[] args) {
        String st="Separate line";

        for (int i=0; i<st.length(); i++){
            if ((st.charAt(i)>='a'&&st.charAt(i)<='z')||(st.charAt(i)>='A'&&st.charAt(i)<='Z')) System.out.println(st.charAt(i));

        }
    }
}
