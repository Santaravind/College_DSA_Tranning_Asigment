package Assigment.Third_5_JUNE_to_9_JUNE;

public class String1_Count_Characters {
    public static void main(String[] args) {
        String st="Write a program to find and display the total number of characters present in a given string";
        int count=0;

        for (int i=0; i<st.length(); i++){
            if ((st.charAt(i)>='a'&&st.charAt(i)<='z')||(st.charAt(i)>='A'&&st.charAt(i)<='Z')){
                count++;
            }
        }
        System.out.println("Total number of character :\t"+count);
    }
}
