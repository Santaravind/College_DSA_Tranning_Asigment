package Assigment.Third_5_JUNE_to_9_JUNE;

public class String5_Reverse_String {
    public static void main(String[] args) {
        String st="String character to reverse character";

        for (int i=st.length()-1; i>=0; i--){
            System.out.print(st.charAt(i));
        }

        System.out.println(" ");

        String s[]=st.split(" ");
        for (int i=s.length-1; i>=0; i--){
            System.out.print(s[i]+ " ");
        }

    }
}
