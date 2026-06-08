package Assigment.Third_5_JUNE_to_9_JUNE;

public class String35_ASCII_Value_Of_Character {
    public static void main(String[] args) {
        String st="Write a program to display the ASCII value of each character in a string";

        for (int i=0; i<st.length(); i++){
            System.out.println("ASCII Value of "+st.charAt(i)+":\t"  +(int)st.charAt(i));
        }

    }
}
