package Assigment.Six_Assigment19_22_June;

import java.security.spec.ECField;

public class Q7_Nested_Try_Catch {
    public static void main(String[] args) {
        int arr[]=new int[3];
        int a=9;
        int b=1;
        try {
            int c=a/b;
            try {
                 arr[3]=4;
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
