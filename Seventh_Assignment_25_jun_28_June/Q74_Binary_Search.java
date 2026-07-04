package Assigment.Seventh_Assignment_25_jun_28_June;

import java.util.ArrayList;
import java.util.List;

public class Q74_Binary_Search {

    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        int target=6;

        int start=0;
        int end=list.size()-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (list.get(mid)==target){
                System.out.println(mid);
//                break;
            }
            if (list.get(mid)<target){
                start=mid+1;
            }else {
                end=mid-1;
            }
        }

//        boolean found=false;
//        for (int v:list){
//            if (target==v){
//                 found=true;
//            }
//        }
//
//        if (found){
//            System.out.println("Element found into list");
//        }else  System.out.println("Element not found into list");
    }
}
