package Assigment.Third_5_JUNE_to_9_JUNE.StringQuestion;

public class String6_Is_a_Palindrome {
    public static boolean isPolindrome(String s){

       s=s.toLowerCase();
       char ch[]=new char[s.length()];
       int j=0;
       for (int i=0; i<s.length(); i++){
           if (s.charAt(i)>='a'&&s.charAt(i)<='z'){
               ch[j++]=s.charAt(i);
           }
       }
       int i=0;
       int k=j-1;
       while (i<k){
           if (ch[i]!=ch[k]){
               return false;
           }
           i++;
           k--;
       }


        return true;
    }
    public static void main(String[] args) {
//        String st="A man, a plan, a canal: Panama";
        String st= "race a car";

        System.out.println(isPolindrome(st));
    }
}
