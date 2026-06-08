package Assigment.first;

class Employee{
   static int id=100;
    String name;
    String role;

    Employee(String name, String role){
        this.name=name;
        this.role=role;
        id++;
    }

    void display(){
        System.out.println( "ID :"+ id + "\n" +"Name of Employee : "+ name+ "\n"+ "Role : "+ role);
        System.out.println(" \n");
    }


}

public class Employee_3_June {
    public static void main(String[] args) {
        Employee e1=new Employee("sant","Full stack");
        e1.display();
        Employee e2=new Employee("Aravind","Junier  Software Engineer");
        e2.display();
        Employee e3=new Employee("Aravind Sant","Software Engineer");
        e3.display();


    }
}
