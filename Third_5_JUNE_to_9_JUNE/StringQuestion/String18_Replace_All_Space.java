package Assigment.Third_5_JUNE_to_9_JUNE.StringQuestion;

public class String18_Replace_All_Space {
    public static void main(String[] args) {
        String st="Write a program to remove all spaces from a string";


        //through replacing all white space with dot
        System.out.println(st.replaceAll(" ","."));

        //Complete remove all white space
        System.out.println( "Removing all while space\t");
        String s[]=st.split(" ");
        for (int i=0; i<s.length; i++){
            System.out.print(s[i]);
        }
    }
}
