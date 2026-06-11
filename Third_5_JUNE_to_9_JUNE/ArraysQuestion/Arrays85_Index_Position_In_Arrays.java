package Assigment.Third_5_JUNE_to_9_JUNE.ArraysQuestion;

public class Arrays85_Index_Position_In_Arrays {
    public static void main(String[] args) {
        int arr[]={56,4,34,23,25,0,9};
        int find=9;

        for (int i=0; i<arr.length; i++){
            if (find==arr[i]){
                System.out.println("Index Position of  element -> " + find + " in index  -> "+ i);
                return;
            }
        }

        System.out.println("Element ->  "+ find +" is not exist in  Arrays");
    }
}
