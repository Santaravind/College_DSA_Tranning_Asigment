package Assigment.Third_5_JUNE_to_9_JUNE;

public class String21_Join_Two_Strings {
    public static void main(String[] args) {
        String st="Hello";
        String st2="World";
        //Concat() method but it is not include white space
        System.out.println(st.concat(st2));



        //using join() Function
        st=String.join(" ",st, "Aravind", "Sant");
        System.out.println(st);


    }
}
