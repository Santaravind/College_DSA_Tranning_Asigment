package Assigment.Six_Assigment19_22_June;

public class Q5_Multiple_Catch_Blocks {
    public static void main(String[] args) {
        int arr[]=new int[3];
        String st="abc";
        int a=6;
        int b=0;
        try {
            int c=a/b;
            arr[3]=45;
            int m=Integer.parseInt(st);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
}
