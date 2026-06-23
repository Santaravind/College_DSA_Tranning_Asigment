package Assigment.Third_5_JUNE_to_9_JUNE.ArraysQuestion;

public class Arrays55_Second_Largest_Element {
    public static void main(String[] args) {
        int arr[]={23,34,2,1,34,67,89};
        int max=arr[0];
        int maxS=0;

        for (int i=0; i<arr.length; i++){
            if (max<arr[i]){
                maxS=max;
                max=arr[i];
            }
        }
//        for (int i=0; i<arr.length; i++){
//            if (max<arr[i]) {
//                second = max;
//                max = arr[i];
//            }
//            if (max>arr[i]&&arr[i]>second){
//                second=arr[i];
//            }
//
//
//        }
        System.out.println("Second largest element : "+ maxS);

    }
}
