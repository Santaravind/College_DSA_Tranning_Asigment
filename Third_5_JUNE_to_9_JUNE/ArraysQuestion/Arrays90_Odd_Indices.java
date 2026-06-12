package Assigment.Third_5_JUNE_to_9_JUNE.ArraysQuestion;

public class Arrays90_Odd_Indices {
    public static void main(String[] args) {
        int arr[]={5,4,15,6,58,3,4,56,85,4,34,9 };

        System.out.println("Odd indices values in array : ");
        for (int i=0; i<arr.length; i++){
            if (i%2!=0){
                System.out.print(arr[i] + " ");
            }
        }


    }
}
