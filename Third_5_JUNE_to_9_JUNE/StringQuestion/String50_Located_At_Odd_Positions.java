package Assigment.Third_5_JUNE_to_9_JUNE.StringQuestion;

public class String50_Located_At_Odd_Positions {
    public static void main(String[] args) {
        String st=" located at odd positions";

        System.out.println("Character at Odd position :\t ");
        for (int i=0; i<st.length(); i++){
            if (i%2!=0) System.out.print(st.charAt(i));
        }
    }
}
