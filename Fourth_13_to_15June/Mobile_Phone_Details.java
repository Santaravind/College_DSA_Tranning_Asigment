package Assigment.Fourth_13_to_15June;

class Phone{
    private String brand;
    private String model;
    private double price;

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public Phone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void displayDetails(){
        System.out.println("Mobile Pone Details");
        System.out.println("Brand : "+ brand);
        System.out.println("Model : "+ model);
        System.out.println("Price : "+ price);
    }
}
public class Mobile_Phone_Details {
    public static void main(String[] args) {

        Phone nokia=new Phone("Nokia","nokia3310", 1500.00);
        nokia.displayDetails();
        Phone sam=new Phone("Samsung","galexi120", 84000.00);
        sam.displayDetails();

    }
}
