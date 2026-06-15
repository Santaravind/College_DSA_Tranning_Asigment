package Assigment.Fourth_13_to_15June;
class EmployeeManagement{
    private String empId;
    private double salary;
    private String name;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public double getSalary() {

        return salary;
    }

    public void setSalary(double salary) {
        if (salary<0) System.out.println("Salary negative is not allow !! ");
        else this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    void displatDetails(){
        System.out.println("Name : "+ name);
        System.out.println("Employee ID : "+ empId);
        System.out.println("Salary : "+ salary);
    }
}
public class Employee_Salary_Management {
    public static void main(String[] args) {
        EmployeeManagement em=new EmployeeManagement();
        em.setName("Sant");
        em.setEmpId("S01");
        em.setSalary(85000.00);
        em.displatDetails();

        EmployeeManagement em2=new EmployeeManagement();
        em2.setName("Sant");
        em2.setEmpId("S01");
        em2.setSalary(85000.00);
        em2.displatDetails();

    }

}


