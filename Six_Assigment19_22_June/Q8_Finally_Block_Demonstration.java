package Assigment.Six_Assigment19_22_June;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q8_Finally_Block_Demonstration {
    public static void main(String[] args) {
        Queue<Integer> list=new LinkedList<>();
//        list.add(9);
        try {
//            System.out.println(list.poll());
            list.remove();
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("The Finally block is executed !!!");
        }
    }
}
