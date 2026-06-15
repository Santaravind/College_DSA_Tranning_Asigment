package Assigment.Fourth_13_to_15June;
class Person{
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<=0){
            System.out.println("Age is not negative !!");
        }else {
            this.age = age;
        }

    }
    void display(){
        System.out.println("Person  Age : " + age);
    }
}
public class Person_Age_Validation {
    public static void main(String[] args) {
        Person ps=new Person();
        ps.setAge(23);
        ps.display();
        ps.setAge(-2);
        ps.display();
    }
}
