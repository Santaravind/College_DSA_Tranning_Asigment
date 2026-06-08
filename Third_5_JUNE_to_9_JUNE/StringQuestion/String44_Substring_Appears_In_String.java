package Assigment.Third_5_JUNE_to_9_JUNE.StringQuestion;

public class String44_Substring_Appears_In_String {
    public static void main(String[] args) {
//        String st=" Write a program to count how many times a given substring appears in a string ";
        String st=" Write a program to count in how many times a given substring in appears in a string ";
        String subString="in";
//        String subString="a";
        String s[]=st.trim().split(" +");

         int count=0;
         for (int i=0; i<s.length; i++){
             if (s[i].equals(subString)) count++;
         }

        System.out.println("SubString "+subString + "  appears  : "+ count);
    }
}
