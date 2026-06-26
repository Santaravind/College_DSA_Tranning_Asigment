package Assigment.Seventh_Assignment_25_jun_28_June;

import java.sql.SQLOutput;

public class Q2_Find_Second_Largest_Element {
    public static void main(String[] args) {
        int arr[]={ 10, 20, 4, 45, 99, 99, 45, 1};
        int firstLargest=arr[0];
        int secondLargest=Integer.MIN_VALUE;
        for (int i=0; i<arr.length;i++){
            if (firstLargest<arr[i]){
                secondLargest=firstLargest;
                firstLargest=arr[i];
            }
            if (firstLargest>arr[i]&&secondLargest<arr[i]){
                secondLargest=arr[i];
            }

        }

//        System.out.println("The first largest is  : " + firstLargest);
        
        System.out.println("The second largest is : " + secondLargest);

    }
}
