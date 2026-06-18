package Assigment.Five_Assigment5;
abstract class Vehicle{
    abstract void start();
}

class  Bike extends  Vehicle{


    void start() {
        System.out.println("Bike starts with a self-start button");
    }
}
class  Car extends  Vehicle{


    void start() {
        System.out.println("Car starts with a key.");
    }
}
class  Truck extends  Vehicle{


    void start() {
        System.out.println("Truck starts with heavy ignition.");
    }
}

public class Vehicle_Start_System {
    public static void main(String[] args) {
       Vehicle v=new Bike();
       v.start();

       Vehicle v1=new Car();
       v1.start();

       Vehicle v2 =new Truck();
       v2.start();
    }
}
