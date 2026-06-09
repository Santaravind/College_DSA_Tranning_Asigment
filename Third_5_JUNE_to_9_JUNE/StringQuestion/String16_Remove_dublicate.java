package Assigment.Third_5_JUNE_to_9_JUNE.StringQuestion;
//this is not work
public class String16_Remove_dublicate {
    public static void main(String[] args) {
//        String st="abc abc";
//        String st="Write a program to remove duplicate characters from a string while keeping the first occurrence";
//        st=st.toLowerCase();
//        char ch[]=new char[26];
//        int fre[]=new int[26];


//        for (int i=0; i<st.length(); i++){
//            if (st.charAt(i)!=' '&&fre[st.charAt(i)-'a']!=1) {
//                ch[st.charAt(i)-'a']=st.charAt(i);
//                fre[st.charAt(i) - 'a']++;
//            }
//        }

//        System.out.println(String.valueOf(ch));


        String s="Write a program to remove duplicate characters from a string while keeping the first occurrence";

        StringBuilder sb = new StringBuilder(s.length());
        boolean[] seen = new boolean[256];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);


            if (!seen[c]) {
                sb.append(c);
                seen[c] = true;
            }
        }

        System.out.println(sb);

    }
}
