package Assigment.Second4_JUNE;

public class Strings_Are_Euals {
    public static void main(String[] args) {
        String st="Sant";
        String  st2="Sant";
        String st3=new String("Sant");


            System.out.println("String st and st2 equals : "+ (st==st2));

            System.out.println("String st2 and st3 equals in values : "+ st2.equals(st3) );

            System.out.println("String st2 and st3 is equals in References : "+ (st2==st3));

    }
}
