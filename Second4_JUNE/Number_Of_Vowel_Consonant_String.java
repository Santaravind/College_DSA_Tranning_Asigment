package Assigment.Second4_JUNE;

public class Number_Of_Vowel_Consonant_String {
    public static void main(String[] args) {
        String s="The big dog chased the cAt";
         int vowel=0, con=0;
        for (int i=0; i<s.length(); i++){
            if ((s.charAt(i)=='a'|| s.charAt(i)=='A')||(s.charAt(i)=='e'|| s.charAt(i)=='E')||(s.charAt(i)=='i'|| s.charAt(i)=='I')||(s.charAt(i)=='o'|| s.charAt(i)=='O')||(s.charAt(i)=='u'|| s.charAt(i)=='U') ){
                vowel++;
            }else if (s.charAt(i)==' '){
                continue;
            }else {
                con++;
            }
        }
        System.out.println("Number of Vowel : "+ vowel +
                "\n" +"Number of Consonant : "+ con);

    }
}
