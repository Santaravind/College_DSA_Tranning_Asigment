package Assigment.Fourth_13_to_15June;
class Employee{
      int emId;
       String emName;
     String role;

    public Employee(int emId, String emName, String role) {
        this.emId = emId;
        this.emName = emName;
        this.role=role;
    }

}

class Parson extends Employee{
    Parson( int empId, String emName, String role){
        super(empId,emName,role);

    }
    void displayDetails(){
        System.out.println("Employee Details : " );
        System.out.println("Employee Id    : " + emId );
        System.out.println("Employee Name  : "+ emName );
        System.out.println("Employee Role  : "+ role );
    }




}



public class SuperEmployee {
    public static void main(String[] args) {
        Parson e1=new Parson(12,"Sant", "Admin");

     e1.displayDetails();
    }
}
