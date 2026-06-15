package Assigment.Fourth_13_to_15June;

class Car{
private String company;
private String model;
private float speed;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {

        this.model = model;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        if (speed>200){
            System.out.println("Spreed is not greater than 200 km/h");
            this.speed=200;
        }else  this.speed = speed;
    }

    void display(){
        System.out.println("Car company name : " +company);
        System.out.println("Car model : " +model);
        System.out.println("Car speed: " +speed);
    }
}
public class Car_Speed_Control {
    public static void main(String[] args) {
        Car car=new Car();
        car.setCompany("Tata");
        car.setModel("Jaguar");
        car.setSpeed(300);
        car.display();

//        System.out.println( car.getSpeed());
    }
}
