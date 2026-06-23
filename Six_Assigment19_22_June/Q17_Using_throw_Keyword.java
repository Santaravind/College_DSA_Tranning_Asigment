package Assigment.Six_Assigment19_22_June;

import java.util.Scanner;

public class Q17_Using_throw_Keyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        try {
            if (num < 0) {
                throw new IllegalArgumentException("Number cannot be negative");
            }

            System.out.println("Valid number: " + num);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
