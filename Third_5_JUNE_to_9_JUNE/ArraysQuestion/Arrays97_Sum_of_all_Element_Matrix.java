package Assigment.Third_5_JUNE_to_9_JUNE.ArraysQuestion;

public class Arrays97_Sum_of_all_Element_Matrix {
    public static void main(String[] args) {
        int arr[][]={{4,5,6,4},{6,7,4,3 },{8,7,9,5},{9,9,8,6}};

        int sum=0;
//        System.out.println("Display of matrix : " );

        for (int n[]:arr){
            for (int v:n){
                sum+=v;
            }

        }

        System.out.println("Sum of Matrix : "+ sum);
    }
}
