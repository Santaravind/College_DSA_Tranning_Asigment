package Assigment.first;

class Student{
   static int count;

   Student(){
       count++;
   }
 static   void  numberObj(){
       System.out.println("Total number of Student created : "+ count);
   }
}
public class Student_3_June {
    public static void main(String[] args) {
        Student st=new Student();
        Student st2=new Student();
        Student st3=new Student();
        Student st4=new Student();
        Student st5=new Student();
        Student st6=new Student();
        Student.numberObj();
        System.out.println();

    }
}
