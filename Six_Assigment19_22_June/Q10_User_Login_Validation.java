package Assigment.Six_Assigment19_22_June;

import java.util.Scanner;

public class Q10_User_Login_Validation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        try {
            if (username.isEmpty()) {
                throw new Exception("Username cannot be empty");
            }

            System.out.println("Welcome, " + username);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}

