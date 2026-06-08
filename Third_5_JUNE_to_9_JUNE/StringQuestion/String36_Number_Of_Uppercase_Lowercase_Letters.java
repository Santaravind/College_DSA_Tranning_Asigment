package Assigment.Third_5_JUNE_to_9_JUNE.StringQuestion;

public class String36_Number_Of_Uppercase_Lowercase_Letters {
    public static void main(String[] args) {
        String st=" Number of UPPERCase and lowerCase Letters";
        int upper=0;
        int lower=0;

        for (int i=0; i<st.length(); i++){
            if (st.charAt(i)>='a'&&st.charAt(i)<='z'){
                lower++;
            } else if (st.charAt(i)>='A'&&st.charAt(i)<='Z') {
                upper++;
            }
        }

        System.out.println("Uppercase latter number :\t"+upper);
        System.out.println("Lowercase latter number :\t"+lower);
    }
}
