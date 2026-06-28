package Assigment.Seventh_Assignment_25_jun_28_June;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.List;

public class Q85_Replace_All_Occurrences {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList(List.of(1,2,3,4,2,5,6,2));

        int oldValue=2;
        int newValue=10;
        System.out.println(list);
        for (int i=0; i<list.size(); i++){
            if (list.get(i)==oldValue){
                list.set(i,newValue);
            }
        }
        System.out.println(list);
    }
}
