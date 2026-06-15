package Assigment.Fourth_13_to_15June;

class Persn{
  String   name;
  double salary;


    public Persn(String name, double salary) {
        this.name = name;
        this.salary = salary;

    }
}

class Employe extends Persn{

    public Employe(String name, double salary) {
        super(name, salary);
    }
    void display(){
        System.out.println("Employee details ");
        System.out.println("Employee name :" + name);
        System.out.println("Employee Salary : "+ salary);

    }
}

class  Developer extends Employe{
   String programming_Language;

    public Developer(String name, double salary,String programming_Language) {
        super(name, salary);
        this.programming_Language=programming_Language;

    }

    void display(){
        System.out.println("Developer Details   ");
        System.out.println("Employee name :" + name);
        System.out.println("Employee Salary : "+ salary);
        System.out.println("Programming Language : "+ programming_Language);

    }

}
public class Person_Employee_Developer {
    public static void main(String[] args) {
        Developer dp=new Developer("Sant",85000.00,"core Java");
        dp.display();
    }
}
