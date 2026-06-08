package Assigment.Third_5_JUNE_to_9_JUNE;

public class String16_Remove_dublicate {
    public static void main(String[] args) {
//        String st="abc abcc";
        String st="Write a program to remove duplicate characters from a string while keeping the first occurrence";
        st=st.toLowerCase();
        char ch[]=new char[26];
        int fre[]=new int[26];


        for (int i=0; i<st.length(); i++){
            if (st.charAt(i)!=' '&&fre[st.charAt(i)-'a']!=1) {
                ch[st.charAt(i)-'a']=st.charAt(i);
                fre[st.charAt(i) - 'a']++;
            }
        }

        System.out.println(String.valueOf(ch));
    }
}
