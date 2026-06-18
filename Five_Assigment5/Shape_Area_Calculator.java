package Assigment.Five_Assigment5;
abstract  class Shape{
    abstract  void area();
}
class  Circle extends Shape{

    int radius;
    Circle(int radius){
        this.radius=radius;
    }
    @Override
    void area() {
        System.out.println("Area of Circle : " +(3.14*radius*radius));
    }
}

class Rectangle extends Shape{
     float length;
     float weight;
     Rectangle(float length,float weight){
         this.length=length;
         this.weight=weight;
     }
    @Override
    void area() {
        System.out.println("Area of Rectangle : " + length*weight);
    }
}
public class Shape_Area_Calculator {
    public static void main(String[] args) {
        Shape sp=new Circle(9);
        sp.area();
        Shape shape=new Rectangle(5,6);
        shape.area();
    }
}
