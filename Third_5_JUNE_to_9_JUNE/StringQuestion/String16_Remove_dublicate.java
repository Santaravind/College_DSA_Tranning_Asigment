package Assigment.Third_5_JUNE_to_9_JUNE.StringQuestion;
//this is not work
public class String16_Remove_dublicate {
    public static void main(String[] args) {
//        String st="abc abc z x ";
        String st="Write a program to remove duplicate characters from a string while keeping the first occurrence";
        st=st.toLowerCase();
        char ch[]=new char[26];
        int fre[]=new int[26];



//        for (int i=0; i<st.length(); i++){
//            if (st.charAt(i)!=' '&&fre[st.charAt(i)-'a']!=1) {
//                ch[st.charAt(i)-'a']=st.charAt(i);
//                fre[st.charAt(i) - 'a']++;
//            }
//        }
//
//         for(char c :ch){
//             if (c!=0) System.out.print(c);
//         }

         StringBuilder sb=new StringBuilder();
         int i=0;
       while(st.length()>0){
             sb.append(st.charAt(i));
            st= st.replaceAll( String.valueOf(st.charAt(0)), "");

         }


        System.out.println(sb);

         int n='a';
        System.out.println(n);
        System.out.println((int)('a'));
        char c = 65;
        System.out.println(c);
//        String s="Write a program to remove duplicate characters from a string while keeping the first occurrence";
//
//        StringBuilder sb = new StringBuilder(s.length());
//        boolean[] seen = new boolean[256];
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//
//
//            if (!seen[c]) {
//                sb.append(c);
//                seen[c] = true;
//            }
//        }
//
//        System.out.println(sb);

    }
}
