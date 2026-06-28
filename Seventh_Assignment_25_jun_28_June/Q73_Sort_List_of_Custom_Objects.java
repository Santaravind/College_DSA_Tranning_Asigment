package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.ArrayList;
import java.util.Collections;

class  Employee{
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", salary=" + salary+"\n" ;
    }
}
public class Q73_Sort_List_of_Custom_Objects {
    public static void main(String[] args) {
     Employee e1=new Employee("Sant ",85000.0);
     Employee e2=new Employee("Shyam",65000.0);
     Employee e3=new Employee("vishal",95000.0);
     Employee e4=new Employee("Aravind",90000.0);
     Employee e5=new Employee("Ravind",9000.0);

        ArrayList<Employee>list=new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        System.out.println(list);

        Collections.sort(list,(a,b)->a.getName().compareTo(b.getName()));
        System.out.println(list);

    }
}
