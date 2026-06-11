package Assigment.Third_5_JUNE_to_9_JUNE.ArraysQuestion;

public class Arrays79_Total_Positive_Negative_Elements {
    public static void main(String[] args) {
        int arr[]={23,4,3,2,-3,-5,7,-8,9};
        int positive=0;
        int negative=0;

        for (int i=0; i<arr.length; i++){
            if (arr[i]>0){
                positive++;
            } else if (arr[i]<0) {
                negative++;
            }
        }

        System.out.println("Total positive Elements : "+ positive);
        System.out.println("Total negative Elements : "+ negative);

    }
}
