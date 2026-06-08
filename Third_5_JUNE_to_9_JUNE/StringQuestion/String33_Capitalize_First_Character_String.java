package Assigment.Third_5_JUNE_to_9_JUNE.StringQuestion;

public class String33_Capitalize_First_Character_String {
    public static void main(String[] args) {
        String st="program to capitalize only the first character of a string.";

        char ch[]=st.toCharArray();
        if(Character.isLowerCase(ch[0])){
            ch[0]=Character.toUpperCase(ch[0]);
        }
             st=String.valueOf(ch);
        System.out.println(st);


    }
}
