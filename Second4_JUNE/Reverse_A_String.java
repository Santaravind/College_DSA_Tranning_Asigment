package Assigment.Second4_JUNE;

public class Reverse_A_String {
    public static void main(String[] args) {
        String st="Aravind Sant Singh";


        System.out.println("Reverse in Characters  : ");
        //Reverse all charecter
        for (int i=st.length()-1; i>=0; i--){
            System.out.print(st.charAt(i));
        }

        System.out.println( " \n");
        //Reverse in words
        System.out.println("Reversed string : ");
        String s[]=st.split(" ");
        for (int i=s.length-1; i>=0; i--){
            System.out.print(s[i]);
            System.out.print(" ");

        }

    }
}
