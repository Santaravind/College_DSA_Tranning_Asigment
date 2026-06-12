package Assigment.Third_5_JUNE_to_9_JUNE.ArraysQuestion;

public class Arrays99_Smallest_Element_In_Matrix {
    public static void main(String[] args) {
        int arr[][]={
                {4,5,6,4},
                {6,7,4,3 },
                {8,2,9,5},
                {9,29,8,6}
            };

        int min=arr[0][0];

        for (int n[]:arr){
            for (int v:n){
                if (min>v){
                    min=v;
                }
            }
        }

        System.out.println("Minimum number in array : " + min);

    }
}
