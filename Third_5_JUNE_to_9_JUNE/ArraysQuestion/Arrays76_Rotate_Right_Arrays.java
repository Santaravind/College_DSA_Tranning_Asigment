package Assigment.Third_5_JUNE_to_9_JUNE.ArraysQuestion;

public class Arrays76_Rotate_Right_Arrays {
    public static void main(String[] args) {
        int arr[]= {34,4,5,3,2,5};
        int temp=arr[arr.length-1];

        for (int i=arr.length-1; i>=1; i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        System.out.println("One value right Rotation : ");
        for (int b: arr){
            System.out.print(b+" ");
        }
    }
}
