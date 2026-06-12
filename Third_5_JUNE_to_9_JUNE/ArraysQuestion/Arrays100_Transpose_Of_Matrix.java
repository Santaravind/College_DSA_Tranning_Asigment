package Assigment.Third_5_JUNE_to_9_JUNE.ArraysQuestion;

public class Arrays100_Transpose_Of_Matrix {
    public static void main(String[] args) {
        int arr[][]={
                {4,15,6,4},
                {96,7,4,3 },
                {8,2,89,5},
        };



        int row=arr.length;
        int col=arr[0].length;
        System.out.println("Normal Matrix : ");
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }

        System.out.println("Transpose of Matrix : ");

        for (int i=0; i<col; i++){
            for (int j=0; j<row; j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println(" ");
        }
    }
}
