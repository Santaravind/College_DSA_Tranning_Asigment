package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.LinkedList;
import java.util.List;

public class Q17_Find_Middle_Element_of_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer>linkedList=new LinkedList<>(List.of(1, 2, 3, 4, 5));
//        int start=0;
        int mid=0;
        int n=linkedList.size();
//        if (n%2==0){
//            mid=(n/2);
//        }else {
            mid=n/2;
//        }
        System.out.println(linkedList.get(mid));

    }
}
