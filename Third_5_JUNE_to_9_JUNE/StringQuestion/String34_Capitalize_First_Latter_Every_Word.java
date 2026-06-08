package Assigment.Third_5_JUNE_to_9_JUNE.StringQuestion;

public class String34_Capitalize_First_Latter_Every_Word {
    public static void main(String[] args) {
        String st=" Write a program to capitalize ";

        String st2[]=st.trim().split(" +");
        for (int i=0; i<st2.length; i++){
             char ch[]=st2[i].toCharArray();
            if(Character.isLowerCase(ch[0])){
                ch[0]=Character.toUpperCase(ch[0]);
            }
            st2[i]=String.valueOf(ch);
            System.out.print(st2[i]+" ");
        }


     }
}
