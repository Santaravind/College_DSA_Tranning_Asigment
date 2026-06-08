package Assigment.Third_5_JUNE_to_9_JUNE.StringQuestion;

public class String8_Consonants {
    public static void main(String[] args) {
        String s="The big dog chased the cAt";
         int consonant=0;
        for (int i=0; i<s.length(); i++){
            if ((s.charAt(i)=='a'|| s.charAt(i)=='A')||(s.charAt(i)=='e'|| s.charAt(i)=='E')||(s.charAt(i)=='i'|| s.charAt(i)=='I')||(s.charAt(i)=='o'|| s.charAt(i)=='O')||(s.charAt(i)=='u'|| s.charAt(i)=='U'||s.charAt(i)==' ') ){
           continue;
            }else consonant++;

        }

        System.out.println("Number of consonant : \t"+ consonant);
    }
}
