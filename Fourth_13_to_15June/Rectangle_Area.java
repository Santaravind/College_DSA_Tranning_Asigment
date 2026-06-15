package Assigment.Fourth_13_to_15June;

class Rectangle{
 private  float length;
 private  float weight;

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    public void area(){
        System.out.println( "Area of Rectangle : " +length*weight);
    }
}
public class Rectangle_Area {
    public static void main(String[] args) {

        Rectangle r1=new Rectangle();
        r1.setLength(3.2F);
        r1.setWeight(3.2F);
        r1.area();

    }
}
