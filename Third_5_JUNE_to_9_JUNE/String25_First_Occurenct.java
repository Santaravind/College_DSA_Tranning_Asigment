package Assigment.Third_5_JUNE_to_9_JUNE;

public class String25_First_Occurenct {
    public static void main(String[] args) {
        String st="Write a program to find the position of the first occurrence of a character in a\n" +
                "string";

        for (int i=0; i<st.length();i++){
            if (st.charAt(i)==' ') continue;
            System.out.println("Position of the first occurrence : "+ st.charAt(i) +" " +st.indexOf(st.charAt(i)));
        }

    }
}
