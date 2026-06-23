package Assigment.Six_Assigment19_22_June;

public class Q18_Exception_Propagation {
    static void method1() {
        System.out.println("Inside method1");
        method2();
    }

    static void method2() {
        System.out.println("Inside method2");
        method3();
    }

    static void method3() {
        System.out.println("Inside method3");
        int result = 10 / 0;  // Exception generated here
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {

        try {
            method1();
        } catch (ArithmeticException e) {
            System.out.println("Exception caught in main: " + e);
        }

        System.out.println("Program continues...");
    }
}


