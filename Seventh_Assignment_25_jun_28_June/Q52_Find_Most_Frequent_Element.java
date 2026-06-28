package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.HashMap;

public class Q52_Find_Most_Frequent_Element {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,3,3,4,4,5};
        HashMap<Integer, Integer>map=new HashMap<>();
int max=Integer.MIN_VALUE;
        for (int n :arr){
           map.put(n,map.getOrDefault(n,0)+1);

        }
        int result =0;
        for (int n: map.keySet()){
            if (max<map.get(n)){
                result=n;
                max=map.get(n);
            }
        }

        System.out.println("Most frequent Element : "+result);
    }
}
