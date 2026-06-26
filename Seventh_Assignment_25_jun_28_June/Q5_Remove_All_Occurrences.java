package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Q5_Remove_All_Occurrences {
    public static void main(String[] args) {
        ArrayList<Integer>ls=new ArrayList(List.of(1, 2, 3, 2, 4, 2, 5));
        Integer target=2;

//        ls.removeAll(Collections.singleton(2));

       Iterator<Integer>list= ls.iterator();
       while (list.hasNext()){
           if (list.next()==target){
               list.remove();
           }
       }

        System.out.println(ls);
    }
}
