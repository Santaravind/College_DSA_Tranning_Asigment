package Assigment.Six_Assigment19_22_June;

public class Q9_Return_Statement_with_Finally {
    public static int  returnMethod(){

        int a=9;
        int b=8;
        int c;
        try {
            c=a/b;
            return c;
        }catch (Exception e){
            System.out.println(e.getMessage());

        }finally {
            return 4;


        }
//        return 0;
    }
    public static void main(String[] args) {
        System.out.println(returnMethod());
    }
}
