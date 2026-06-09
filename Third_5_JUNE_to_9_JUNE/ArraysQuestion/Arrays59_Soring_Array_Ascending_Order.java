package Assigment.Third_5_JUNE_to_9_JUNE.ArraysQuestion;

public class Arrays59_Soring_Array_Ascending_Order {
    public static void main(String[] args) {
        int arr[]={4,5,3,2,6,7,8,96,3,23,9};
        int n=arr.length;
        int j;
        for (int i=0; i<arr.length; i++ ){
            j=i-1;
            int key=arr[i];
            while (j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }

        System.out.println("Array sorting in Ascending order : ");
        for (int x:arr){
            System.out.print(x + " ");
        }
    }
}
