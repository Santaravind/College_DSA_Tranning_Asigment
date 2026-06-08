package Assigment.Third_5_JUNE_to_9_JUNE;

public class String37_Contains_Only_Numeric_Characters {
    public static boolean checkNumbers(String s){
        int count=0;
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i)>='0'&&s.charAt(i)<='9'){
                count++;
            } else if (s.charAt(i)==' ') {
                count++;
            }
        }

        if (count==s.length())return true;

        return false;
    }
    public static void main(String[] args) {
        //It gives the false
//        String st="contains only numeric characters";
         String st="123 234";
        System.out.println("String contains only numerical value :\t"+checkNumbers(st));
    }
}
