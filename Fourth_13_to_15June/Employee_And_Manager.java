package Assigment.Fourth_13_to_15June;
class Employees{
    String name;
    double salary;

    public Employees(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}
class Manager extends  Employees{
    String departmment;
    Manager(String name , double salary, String departmment){
        super(name,salary);
        this.departmment=departmment;

    }
 void displaye(){
     System.out.println("Manager Details : ");
     System.out.println("Name : " + name);
     System.out.println("Department : " + departmment);
     System.out.println("Salary : " + salary);

 }
}
public class Employee_And_Manager {
    public static void main(String[] args) {
   Manager m1=new Manager("Sant", 85000.0," Java Full Stack ");
   m1.displaye();
    }
}
