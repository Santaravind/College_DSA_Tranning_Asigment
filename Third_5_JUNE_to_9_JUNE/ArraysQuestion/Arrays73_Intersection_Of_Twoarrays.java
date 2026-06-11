package Assigment.Third_5_JUNE_to_9_JUNE.ArraysQuestion;

import java.util.Vector;

public class Arrays73_Intersection_Of_Twoarrays {
    public static void main(String[] args) {
        int arr1[]={34,5,6,4,35,3};
        int arr2[]={45,6,76,7,34,2};

        Vector<Integer> vt=new Vector<>();
        int i=0;
        while(i<arr1.length){
            int m=arr1[i];
            int j=0;
            while (j<arr2.length){
                if(m==arr2[j]){
                 vt.add(m);
                }
                j++;
            }
            i++;
        }
        System.out.println("Intersection Elements : " +vt);
    }
}
