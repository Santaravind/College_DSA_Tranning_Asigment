package Assigment.Third_5_JUNE_to_9_JUNE.StringQuestion;

public class String9_Digit_Present {
    public static void main(String[] args) {
        String st="hear me leaning 209 5 teen 3 taal on 6 ";
        int digit=0;

        for (int i=0; i< st.length(); i++){
            if(st.charAt(i)>='0'&&st.charAt(i)<='9'){
                digit++;
            }
        }

        System.out.println("Digit present in digit \t"+digit);
    }
}
