package Assigment.Six_Assigment19_22_June;

import java.util.Scanner;

class PasswordException extends Exception {
    public PasswordException(String message) {
        super(message);
    }
}

public class Q14_Password_Validation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        try {
            if (password.length() < 8) {
                throw new PasswordException("Password must be at least 8 characters long");
            }

            System.out.println("Password is valid");

        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}


