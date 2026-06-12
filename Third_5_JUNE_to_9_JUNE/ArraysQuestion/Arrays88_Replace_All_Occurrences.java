package Assigment.Third_5_JUNE_to_9_JUNE.ArraysQuestion;

public class Arrays88_Replace_All_Occurrences {
    public static void main(String[] args) {
        int arr[]={2,3,4,3,2,1,5,6,7,8,9};
        int element=3;

        System.out.println("Before replacement : ");
        for (int b: arr){
            System.out.print(b +" ");
        }


        for (int i=0; i<arr.length; i++){
            if (arr[i]==element){
                arr[i]=34;
            }
        }
        System.out.println("\nAfter replacement of element : 3 with 34 ");
        for (int v: arr){
            System.out.print(v +" ");
        }
    }
}
