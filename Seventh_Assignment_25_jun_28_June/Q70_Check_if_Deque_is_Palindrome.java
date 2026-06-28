package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Q70_Check_if_Deque_is_Palindrome {
    public static void main(String[] args) {
        Queue<Character>queue=new ArrayDeque<>(List.of('a', 'b', 'c', 'b', 'a'));

        List<Character>list=new ArrayList<>(queue);
        int left=0;
        int right=list.size()-1;
        boolean isPo=false;
        while (left<=right){
            if (list.get(left)!=list.get(right)){
                isPo=true;
                break;
            }
            left++;
            right--;
        }

        if (isPo){
            System.out.println(false);
        }else {
            System.out.println(true);
        }
    }
}
