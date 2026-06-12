package Assigment.Third_5_JUNE_to_9_JUNE.ArraysQuestion;

public class Arrays87_Delete_In_Specific_Position {
    public static void main(String[] args) {
        int arr[]={5,4,3,4,90,89,0};
        int pos=9;

        if (pos<arr.length){
            System.out.println("Deleted Element in array : "+ arr[pos]);
            arr[pos]=0;
        }else {
            System.out.println("Position is not exits ");
            return;
        }

        for (int i: arr){
            System.out.print(i+" ");
        }

    }
}
