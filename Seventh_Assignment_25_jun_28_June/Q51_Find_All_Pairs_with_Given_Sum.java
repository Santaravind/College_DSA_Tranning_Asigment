package Assigment.Seventh_Assignment_25_jun_28_June;

public class Q51_Find_All_Pairs_with_Given_Sum {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int target=6;

        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i]+arr[j]==target){
                    System.out.println("["+ arr[i]+","+arr[j]+"]");
                }
            }
        }
    }
}
