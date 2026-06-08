package Assigment.Third_5_JUNE_to_9_JUNE;

public class String7_Vowel {
    public static void main(String[] args) {
        String s="The big dog chased the cAt";
        int vowel=0;

        for (int i=0; i<s.length(); i++){
            if ((s.charAt(i)=='a'|| s.charAt(i)=='A')||(s.charAt(i)=='e'|| s.charAt(i)=='E')||(s.charAt(i)=='i'|| s.charAt(i)=='I')||(s.charAt(i)=='o'|| s.charAt(i)=='O')||(s.charAt(i)=='u'|| s.charAt(i)=='U') ){
                vowel++;
            }
        }

        System.out.println("Number of Vowel in string : \t"+vowel);

    }
}
