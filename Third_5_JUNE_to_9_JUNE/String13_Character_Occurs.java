package Assigment.Third_5_JUNE_to_9_JUNE;

public class String13_Character_Occurs {
    public static void main(String[] args) {
        String  st=". Write a program to find how many times a particular character occurs in a\n" +
                "string.";
        char ch='i';
        int occur=0;
        for (int i=0; i<st.length(); i++){
            if (st.charAt(i)==ch){
                occur++;
            }
        }

        System.out.println("Occurrence of  particular Number :\t"+occur);
    }
}
