package Assigment.Third_5_JUNE_to_9_JUNE;

public class String32_UppertoLowerCase_LowerToUpperCase {
    public static void main(String[] args) {
        String st="Write a program to convert uppercase letters to LOWERCASE and lowercase letters\n" +
                "to UPPERCASE.";

        char ch[]=st.toCharArray();
        for (int i=0; i<st.length(); i++){
            if (Character.isLowerCase(ch[i])){
//                st=st.replace(st.charAt(i),Character.toUpperCase(st.charAt(i)));
                   ch[i]=Character.toUpperCase(ch[i]);
            }else if (Character.isUpperCase(ch[i])){
//                st=st.replace(st.charAt(i),Character.toLowerCase(st.charAt(i)));
                   ch[i]=Character.toLowerCase(ch[i]);
            }
        }

        System.out.println(String.valueOf(ch));
    }
}
