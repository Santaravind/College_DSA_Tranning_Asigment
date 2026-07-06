package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.HashMap;
import java.util.List;

public class Q49 {
    public static boolean twoPair(int arr[], int target){
        HashMap<Integer,Integer>map=new HashMap<>();
        if (arr.length%2!=0){
//            System.out.println(false);
            return false;
        }
        for (int i=0; i<arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
            for (int i = 0; i < arr.length; i++) {
                int compliment = target - arr[i];
                if (!map.containsKey(compliment)){
                    return false;
                }
                if ((map.get(compliment) == 0)) {
                    continue;
                } else if (map.containsKey(compliment)) {;
                        map.put(compliment, map.get(compliment) - 1);
                        map.put(arr[i], map.get(arr[i]) - 1);
                        System.out.println("("+compliment+" , "+arr[i]+")");
                } else if (compliment == arr[i]) {
                    if (map.get(compliment) >= 2) {
                        map.put(compliment, map.get(compliment) - 2);
                        System.out.println("("+compliment+" , "+compliment+")");
                    } else {
                        return false;
                    }
                }
            }

        return  true;
    }
    public static void main(String[] args) {
//        Input: [1, 5, 7, -1, 5, 3, 8, 2]
//        Output: true (Pairs: (1,7), (5,3), (-1,5), (8,2))
//        Difficulty: Intermediate
//        Description: Write a method to check if an array can be
//        divided into pairs with equal sum using
//        HashMap.

//        int arr[]={2,6,2,6,6,2,4,4,4,4};
//                int taget=8;
//        int arr[]={-7,2,4,1,4,1,6,-1,1,4,8,-3};
       int arr[]={3,2,4,1,4,1};
  int taget=5;
        System.out.println(twoPair(arr,taget));


    }
}
