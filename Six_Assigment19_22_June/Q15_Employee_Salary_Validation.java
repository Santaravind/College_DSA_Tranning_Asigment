package Assigment.Six_Assigment19_22_June;
import java.util.Scanner;

class NegativeSalaryException extends Exception {
    public NegativeSalaryException(String message) {
        super(message);
    }
}
public class Q15_Employee_Salary_Validation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        try {
            if (salary < 0) {
                throw new NegativeSalaryException("Salary cannot be negative");
            }

            System.out.println("Salary: " + salary);

        } catch (NegativeSalaryException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}


