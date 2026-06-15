package Assigment.Fourth_13_to_15June;

class Animal {
    void eat(){
        System.out.println("Animal is eat foot !!");
    }
}

class Dog extends Animal{
    @Override
    void eat(){
        System.out.println("Dog ead bread !!");
    }
    void bark(){
        System.out.println("Dog is barking to other !!");
    }
}
public class Animal_and_Dog {
    public static void main(String[] args) {
//        Animal a=new Dog();
//        a.eat();

        Dog d=new Dog();
        d.bark();
        d.eat();
    }
}
