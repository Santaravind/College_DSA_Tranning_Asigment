package Assigment.Fourth_13_to_15June;

class Product{
    private int proId;
    private String proName;
    private  double price;

    public int getProId() {
        return proId;
    }

    public void setProId(int proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<0){
            System.out.println("price is not zero !!");
        }else  this.price = price;
    }

    void display(){
        System.out.println("Product Id : " + proId );
        System.out.println("Product Name : " + proName );
        System.out.println("Product price : " + price );

    }
}

public class Product_Information {
    public static void main(String[] args) {
        Product pr=new Product();
        pr.setProId(890);
        pr.setProName("Paracetamol");
        pr.setPrice(6.0);
        pr.display();
     }
}
