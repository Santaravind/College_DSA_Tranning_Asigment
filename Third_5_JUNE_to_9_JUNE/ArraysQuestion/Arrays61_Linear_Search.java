package Assigment.Third_5_JUNE_to_9_JUNE.ArraysQuestion;

public class Arrays61_Linear_Search {
    public  static int SearchElement(int arr[], int k){

        for(int i=0; i<arr.length; i++){
            if (arr[i]==k){
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[]={12,34,54,56,89};
       int k=1;

        System.out.println("Element exist in index : "+SearchElement(arr ,k));
    }
}
