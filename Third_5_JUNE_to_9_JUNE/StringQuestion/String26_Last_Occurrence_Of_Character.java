package Assigment.Third_5_JUNE_to_9_JUNE.StringQuestion;

public class String26_Last_Occurrence_Of_Character {
    public static void main(String[] args) {
        String st="last occurrence of character";

        for (int i=0; i<st.length(); i++){
            System.out.println("Last occurrence of character : "+st.charAt(i) +" " + st.lastIndexOf(st.charAt(i)));
        }
    }
}
