package Assigment.Third_5_JUNE_to_9_JUNE.ArraysQuestion;

public class Arrays57_Reverse_All_Elements {
    public static void main(String[] args) {
        int arr[]={4,5,3,2,6,7,8,96,3,23,9};
        int left=0;
        int right=arr.length-1;
        while (left<right){
            int temp=arr[left];
               arr[left]=arr[right];
               arr[right]=temp;
               left++;
               right--;
        }

        System.out.println("Reverse arrays : ");
        for (int n: arr){
            System.out.print(n + " ");
        }
    }
}
