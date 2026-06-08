package Assigment.Third_5_JUNE_to_9_JUNE;

public class String39_Contains_Only_Letters_Digits {
    public static boolean checkNumbers(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z')||(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
                count++;
            }else if (s.charAt(i)>='0'&&s.charAt(i)<='9'){
                count++;
            } else if (s.charAt(i) == ' ') {
                count++;
            }

        }
        if (count==s.length())return true;


        return false;
    }
    public static void main(String[] args) {
        //It gives use false
//        String st="program to check wh232178ether a string conta23ins only letters and digits 889 903";

        String st="program && ** to check wh232178ether a string conta23ins only letters and digits 889 903";

        System.out.println("String contains only letters and digits :\t"+checkNumbers(st));
    }
}
