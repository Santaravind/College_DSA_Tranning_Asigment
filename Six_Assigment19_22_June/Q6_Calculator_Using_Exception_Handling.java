package Assigment.Six_Assigment19_22_June;

import java.security.spec.ECField;
import java.util.Scanner;

class Calculator{
    int a, b;
    Scanner sc=new Scanner(System.in);
    void sum(){
        System.out.println("Enter the value for addition");
        System.out.println("Enter first number :");
        a=sc.nextInt();
        System.out.println("Enter second number :");
        b=sc.nextInt();
        try {
            int c=a+b;
            System.out.println("Sum of a And b : " + c);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    void sub(){
        System.out.println("Enter the value of subtraction ");
        System.out.println("Enter first number :");
        a=sc.nextInt();
        System.out.println("Enter second number :");
        b=sc.nextInt();
        try {
            int c=a-b;
            System.out.println("Sum of a And b : " + c);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    void mult(){
        System.out.println("Enter the value for multiplication ");
        System.out.println("Enter first number :");
        a=sc.nextInt();
        System.out.println("Enter second number :");
        b=sc.nextInt();
        try {
            int c=a*b;
            System.out.println("Sum of a And b : " + c);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    void  div(){
        System.out.println("Enter the value for division ");
        System.out.println("Enter first number :");
        a=sc.nextInt();
        System.out.println("Enter second number :");
        b=sc.nextInt();
        try {
            int c=a/b;
            System.out.println("Sum of a And b : " + c);
        }catch (Exception e){
            System.out.println(e.getMessage()+"\n Divide by zero not allowed!!");
        }
    }
    Calculator(){
        System.out.println("This is simple calculator of two integer !!");
        System.out.println("It can perform add, sub ,mult and div !!");
    }
}
public class Q6_Calculator_Using_Exception_Handling {
    public static void main(String[] args) {

         Calculator calculator=new Calculator();
         calculator.sum();
          calculator.div();
          calculator.mult();
          calculator.sub();


    }
}
