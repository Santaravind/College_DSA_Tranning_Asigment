package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.ArrayList;
import java.util.List;

public class Q83_Check_if_List_is_Sorted {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>(List.of(1,2,3,4,5,6,7,9));
      boolean ase=true;
        for (int i=0; i<list.size()-1; i++){
            if (list.get(i)<list.get(i+1)){

            }else {
                ase=false;
            }
        }
        if (ase){
            System.out.println("sorted in ascending order : "+true);
        }else {
            System.out.println("not sorted in ascending order "+ false);
        }
    }
}
