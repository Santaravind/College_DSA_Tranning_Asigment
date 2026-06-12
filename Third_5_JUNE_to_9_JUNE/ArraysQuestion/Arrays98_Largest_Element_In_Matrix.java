package Assigment.Third_5_JUNE_to_9_JUNE.ArraysQuestion;

public class Arrays98_Largest_Element_In_Matrix {
    public static void main(String[] args) {
        int arr[][]={{4,5,6,4},{6,7,4,3 },{8,7,9,5},{9,29,8,6}};

        int max=arr[0][0];

        for (int n[]:arr){
            for (int v:n){
                if (v>max){
                    max=v;
                }
            }
        }

        System.out.println("Maximum number in array : " + max);
    }
}
