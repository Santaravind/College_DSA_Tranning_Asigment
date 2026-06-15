package Assigment.Third_5_JUNE_to_9_JUNE.ArraysQuestion;

import java.util.ArrayList;
import java.util.List;

public class Arrays72_Unique_Elements {
    public static void main(String[] args) {
        int arr[]={34,5,6,4,35,3};
        int arr2[]={45,6,76,7,34,2};

        int unique=0;

        List<Integer> ls=new ArrayList<>();
        int i=0;
        while(i<arr.length){
            int m=arr[i];
            int j=0;
            unique=0;
            while (j<arr2.length){
                if(m==arr2[j]){
                  unique++;
                }
                j++;
            }
            if (unique==0) ls.add(m);
            i++;
        }

        System.out.println("Unique Elements  : \t" + ls);
    }
}
