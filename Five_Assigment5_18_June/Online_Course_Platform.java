package Assigment.Five_Assigment5_18_June;
interface  Course{
    void  startCourse();
}
class Java implements Course{

    @Override
    public void startCourse() {
        System.out.println("Java course Started !!");
    }
}
class Python implements Course{

    @Override
    public void startCourse() {
        System.out.println("Python course Started !!");
    }
}
class Web implements Course{

    @Override
    public void startCourse() {
        System.out.println("Web Development Course Started !!");
    }
}
public class Online_Course_Platform {
    public static void main(String[] args) {

        Course java=new Java();
        java.startCourse();
        Course py=new Python();
        py.startCourse();
        Course web=new Web();
        web.startCourse();


    }
}
