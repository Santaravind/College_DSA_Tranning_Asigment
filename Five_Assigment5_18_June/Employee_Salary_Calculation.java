package Assigment.Five_Assigment5_18_June;
abstract class Employee{
 abstract    void calculateSalary();
}
class FullTimeSalary extends Employee{
    float baseSalary;
    FullTimeSalary(float baseSalary){
        this.baseSalary=baseSalary;
    }
    void calculateSalary(){
         float salary=baseSalary;
         salary+=baseSalary*10/100;
         salary+=baseSalary*2/100;
         salary-=baseSalary*3/100;
        System.out.println("Your full time salary: " + salary);
    }
}
class PartTimeEmployee extends Employee{
    float baseSalary;
    PartTimeEmployee(float baseSalary){
        this.baseSalary=baseSalary;
    }
    void calculateSalary(){
        float salary=baseSalary;
        salary+=baseSalary*5/100;
        salary+=baseSalary*3/100;

        System.out.println("Your full time salary: " + salary);
    }
}
public class Employee_Salary_Calculation {
    public static void main(String[] args) {
          Employee st=new FullTimeSalary(85000);
          Employee em=new PartTimeEmployee(15000);
          st.calculateSalary();
          em.calculateSalary();
    }
}
