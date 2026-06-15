package Assigment.Fourth_13_to_15June;
class  Animals{
  public   String name ;

    public Animals(String name) {
        this.name = name;
    }
    void makeSound(){
        System.out.println("Animals make sounds !!");
    }
}
class Cat extends  Animals{
    Cat(String name){
        super(name);
    }

    void makeSound(){
        System.out.println( "Cat "+ name  +" can sound meow !!");
    }
}
public class Animal_and_Cat {
    public static void main(String[] args) {
     Cat c1=new Cat("Lussi");
        c1.makeSound();
    }
}
