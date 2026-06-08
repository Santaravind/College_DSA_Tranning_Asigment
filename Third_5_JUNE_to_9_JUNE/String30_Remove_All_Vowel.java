package Assigment.Third_5_JUNE_to_9_JUNE;

public class String30_Remove_All_Vowel {
    public static void main(String[] args) {
        String st="Write a program to remove all vowels from a string.";

        for (int i=0; i<st.length(); i++){
            if(st.charAt(i)=='a'||st.charAt(i)=='e'||st.charAt(i)=='i'||st.charAt(i)=='o'||st.charAt(i)=='u'||st.charAt(i)=='A'||st.charAt(i)=='E'||st.charAt(i)=='I'||st.charAt(i)=='O'||st.charAt(i)=='U') {
            st=st.replace(st.charAt(i),' ');
            }
        }
        System.out.println("After Replacing vowels with space : "+st);
    }
}
