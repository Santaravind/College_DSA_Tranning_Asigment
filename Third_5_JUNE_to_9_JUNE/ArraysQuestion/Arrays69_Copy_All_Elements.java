package Assigment.Third_5_JUNE_to_9_JUNE.ArraysQuestion;

public class Arrays69_Copy_All_Elements {
    public static void main(String[] args) {
        int arr[]={5,6,4,3,5,4,33,56,45,78,90};
        int newArr[]=new int[arr.length];
        for (int i=0; i<arr.length; i++){
            newArr[i]=arr[i];
        }

        System.out.println("New Array value \t");
       for (int v: newArr){
           System.out.print(v +" ");
       }
    }
}
