package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q86_Iterate_ArrayList {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList(List.of(1,2,3,4,2,5,6,2));

      Iterator<Integer>iterator= list.iterator();
      while (iterator.hasNext()){
          System.out.print(iterator.next()+" ");
      }
    }
}
