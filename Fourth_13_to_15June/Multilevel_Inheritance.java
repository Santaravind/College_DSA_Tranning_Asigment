package Assigment.Fourth_13_to_15June;
class A{
    int a;
    A(int a){
        this.a=a;
    }
}
class B extends A{
    int b;

    B(int a,int b) {
        super(a);
        this.b=b;
    }
}

class  C extends B{
          int c;
    C(int a, int b ,int c) {
        super(a, b);
        this.c=c;

    }

    void sum(){
        System.out.println("Sum of a ,b & c : "+ (a+b+c));
    }
}
public class Multilevel_Inheritance {
    public static void main(String[] args) {
        C c1=new C(2,3,4);
        c1.sum();
    }
}
