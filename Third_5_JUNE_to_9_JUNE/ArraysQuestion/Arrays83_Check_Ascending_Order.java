package Assigment.Third_5_JUNE_to_9_JUNE.ArraysQuestion;

public class Arrays83_Check_Ascending_Order {
    public static boolean checkSortingAscending(int arr[]){

        for (int i=0; i<arr.length-1; i++){
            if (arr[i]<arr[i+1]){
                continue;
            }
            else {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
//        int arr[]={56,4,34,23,25,0,9};
        int arr[]={0,1,2,3,44,5};

        System.out.println("Arrays in Ascending Order : " +checkSortingAscending(arr) );

    }
}
