package Assigment.Six_Assigment19_22_June;

public class Q3_String_to_Integer_Conversion {
    public static void main(String[] args) {
        String st="ABC";
        try {
//            int n=Integer.valueOf(st);
            int m=Integer.parseInt(st);
        }catch (Exception e){
            System.out.println("Invalid  number format.");
            System.out.println(e);
        }
    }
}
