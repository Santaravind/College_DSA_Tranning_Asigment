package Assigment.Third_5_JUNE_to_9_JUNE.StringQuestion;

public class String38_Contains_Only_Alphabetic_Characters {
    public static boolean checkNumbers(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z')||(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
                count++;
            } else if (s.charAt(i) == ' ') {
                count++;
            }

        }
        if (count==s.length())return true;


        return false;
    }

    public static void main(String[] args) {
        String st="Check only alphabetic characters";
        //It gives the false
//        String st="Check only alphabetic chara4453cters";

        System.out.println("String contains only alphabetic value :\t"+checkNumbers(st));

    }
}
