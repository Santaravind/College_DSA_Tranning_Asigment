package Assigment.Six_Assigment19_22_June;

public class Q2_Array_Index_Access {
    public static void main(String[] args) {
        int arr[]=new int[5];
        try {
            arr[5]=40;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
