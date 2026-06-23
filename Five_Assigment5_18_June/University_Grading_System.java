package Assigment.Five_Assigment5_18_June;


abstract  class Studnet{
  abstract   void calculateGrade();
}

class EngineeringStudent extends  Studnet{
          int totalMarks;
          EngineeringStudent(int totalMarks){
              this.totalMarks=totalMarks;
          }
    @Override
    void calculateGrade() {
        if (totalMarks >= 90) System.out.println("Engineering grade : A");
        else if (totalMarks >= 80) System.out.println("Engineering grade : B");
        else if (totalMarks >= 70)System.out.println("Engineering grade : C");
        else System.out.println("Engineering grade : Fail");;
    }
}
class MedicalStudent extends Studnet{
        float cgpa;
        MedicalStudent(float  cgpa){
            this.cgpa=cgpa;
        }
    @Override
    void calculateGrade() {
        float percentage=cgpa*9.5f;
        if (percentage>= 93) System.out.println("Honours with Grade : A");
       else if (percentage>= 75) System.out.println("Pass with Grade : B");
       else System.out.println("False");

    }
}

public class University_Grading_System {
    public static void main(String[] args) {
          Studnet st=new EngineeringStudent(95);
          Studnet medical=new MedicalStudent(9.8f);

          st.calculateGrade();
          medical.calculateGrade();

    }
}
