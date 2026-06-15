package Assigment.Fourth_13_to_15June;
 class Vehicle{

     void speed(){
         System.out.println("Vehicle max speed is 160 km/h");
     }
     void drive(){
         System.out.println("You drive a vehicle !!");
     }
 }

 class Bike extends Vehicle{
     void speed(){
         System.out.println("Bike speed is 120km /h");
     }

     void drive(){
         System.out.println("Now you drive a bike !!");
     }

 }

 class SportBike extends  Bike{

     void speed(){
         System.out.println("Sort Bike max speed is  300km/h !!");
     }
     void drive(){
         System.out.println("Now you drive Sport Bike !!");
     }

 }
public class Vehicle_Bike_SportsBike {
    public static void main(String[] args) {

        SportBike sp=new SportBike();
        sp.speed();
        sp.drive();
    }
}
