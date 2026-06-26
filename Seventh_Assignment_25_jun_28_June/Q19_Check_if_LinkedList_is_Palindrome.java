package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.LinkedList;
import java.util.List;

public class Q19_Check_if_LinkedList_is_Palindrome {
    public static void main(String[] args) {
        LinkedList<Character>list=new LinkedList<>(List.of('a', 'b', 'c', 'b', 'a'));
//        LinkedList<Character>list=new LinkedList<>(List.of('a', 'b', 'c', 'b', 'o'));
        int start=0;
        int end=list.size()-1;
        boolean flag=false;
        while (start<=end){
            if (list.get(start)!=list.get(end)){
                flag=true;
//                System.out.println(false);
                break;
            }
            start++;
            end--;
        }
        if (flag) {
            System.out.println(false);
        }else {
            System.out.println(true);
        }
    }
}
