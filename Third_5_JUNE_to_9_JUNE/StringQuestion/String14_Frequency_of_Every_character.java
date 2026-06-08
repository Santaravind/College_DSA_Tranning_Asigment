package Assigment.Third_5_JUNE_to_9_JUNE.StringQuestion;

public class String14_Frequency_of_Every_character {
    public static void main(String[] args) {
        String st="Write a program to find the frequency of every character in a string";
        st=st.toLowerCase();

        int fre[]=new int[26];
        char ch[]=new char [26];

        for (int i=0; i<st.length(); i++){

            if (st.charAt(i)>='a'&&st.charAt(i)<='z') {
                fre[st.charAt(i)-'a']++;
                ch[ st.charAt(i)-'a'] = st.charAt(i);
            }

        }

        for (int i=0; i<26; i++){
            System.out.println("Character :\t"+ch[i]+ " frequency :\t"+fre[i]);
        }

    }
}
