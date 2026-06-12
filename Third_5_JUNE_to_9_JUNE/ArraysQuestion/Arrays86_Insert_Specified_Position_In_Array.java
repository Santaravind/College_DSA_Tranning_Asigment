package Assigment.Third_5_JUNE_to_9_JUNE.ArraysQuestion;

public class Arrays86_Insert_Specified_Position_In_Array {
    public static void main(String[] args) {
        int arr[]={23,45,67,78,90};
        int pos=8;
        int element=70;
        if (arr.length>pos){
            arr[pos]=element;
        }else {
            System.out.println("Arrays length is not exits in array");
            return;
        }

        for (int v: arr){
            System.out.print(v+ " ");
        }
    }
}
