package Assigment.Third_5_JUNE_to_9_JUNE;

public class String15_Duplicate_Characters {
    public static void main(String[] args) {
        String st="Write a program to identify and display duplicate characters in a string";

         String s;

        for (int i=0; i<st.length(); i++){
            if (st.indexOf(st.charAt(i))!=st.lastIndexOf(st.charAt(i))&&st.charAt(i)!=' '){

                System.out.println("Dublicate charecter \t"+ st.charAt(i));
            }
        }
    }
}
