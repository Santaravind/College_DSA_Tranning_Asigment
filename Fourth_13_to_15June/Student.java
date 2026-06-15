package Assigment.Fourth_13_to_15June;


public class Student {
   private int rollNo;
   private String name ;
   private float marks;

   public int getRollNo() {
      return rollNo;
   }

   public void setRollNo(int rollNo) {
      this.rollNo = rollNo;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public float getMarks() {
      return marks;
   }

   public void setMarks(float marks) {
      this.marks = marks;
   }

   void display(){
      System.out.println("Name of Student : "+ name +"\n"+ "Roll no : "+ rollNo+ "\n"+ "Marks : "+ marks);
   }
}

class Main{
   public static void main(String[] args) {
      Student s1=new Student();
      s1.setName("Sant");
      s1.setRollNo(16);
      s1.setMarks(85);
      s1.display();
   }
}
