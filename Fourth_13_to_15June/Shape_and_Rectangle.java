package Assigment.Fourth_13_to_15June;
class Shape{
    float length;
    float weight;

    public Shape(float length, float weight) {
        this.length = length;
        this.weight = weight;
    }
}
class Rectange extends Shape{
    float area;

    public Rectange(float length, float weight) {
        super(length, weight);
    }

    public float area(){
       return (area=length*weight);
    }
    public void display(){
        System.out.println("Area of rectangle : "+ area());
    }
}
public class Shape_and_Rectangle {
    public static void main(String[] args) {
        Rectange r1=new  Rectange(23.3f,45.5f);
        r1.display();
    }
}
