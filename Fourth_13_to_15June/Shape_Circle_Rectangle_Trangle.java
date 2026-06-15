package Assigment.Fourth_13_to_15June;

class Shapes {
    String name;


    public Shapes(String name) {
        this.name = name;
    }


    public void displayName() {
        System.out.println(" ");
        System.out.println("--- Shape: " + name + " ---");
    }
}


class Circle extends Shapes {
    double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    public void calculateArea() {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Radius: " + radius);
        System.out.printf("Area of Circle: "+ area);
    }
}


class Rectangles extends Shapes {
    double length;
    double width;

    public Rectangles(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }



    public void calculateArea() {
        double area = length * width;
        System.out.println("Dimensions: " + length + " x " + width);
        System.out.printf("Area of Rectangle: " + area);
    }
}


class Triangle extends Shapes {
    double base;
    double height;

    public Triangle(double base, double height) {
        super("Triangle");
        this.base = base;
        this.height = height;
    }

    public void calculateArea() {
        double area = ((double) 1 /2) * base * height;
        System.out.println("Base: " + base + ", Height: " + height);
        System.out.printf("Area of Triangle: %.2f\n", area);
    }
}



public class Shape_Circle_Rectangle_Trangle {
    public static void main(String[] args) {

        Circle c = new Circle(5.0);
        Rectangles r = new Rectangles(4.0, 6.0);
        Triangle t = new Triangle(5.0, 8.0);


        c.displayName();
        c.calculateArea();

        r.displayName();
        r.calculateArea();

        t.displayName();
        t.calculateArea();
    }
}
