package Assigment.Third_5_JUNE_to_9_JUNE.ArraysQuestion;

import java.util.HashMap;
import java.util.HashSet;

public class Arrays66_Frequency_Of_Every_Element {
    public static void main(String[] args) {
        int arr[]={12,3,4,3,2,4,5,6,7,9};
        HashMap<Integer,Integer>map=new HashMap<>();

        for (int i=0; i<arr.length; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else if (map.containsKey(arr[i])){
                int m= map.get(arr[i]);
                m++;
                map.put(arr[i],m);
            }
        }

        for(Integer i: map.keySet()){
            System.out.println("Element :\t "+ i +"\t Value :\t"+ map.get(i));
        }

    }
}
