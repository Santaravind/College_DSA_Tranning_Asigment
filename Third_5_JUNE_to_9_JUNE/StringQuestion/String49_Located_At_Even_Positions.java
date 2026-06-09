package Assigment.Third_5_JUNE_to_9_JUNE.StringQuestion;

public class String49_Located_At_Even_Positions {
    public static void main(String[] args) {
        String st=" located at even positions ";

        System.out.println("Character at Even position : ");
        for (int i=0; i<st.length(); i++){
            if (i%2==0) System.out.print(st.charAt(i));
        }
    }
}
