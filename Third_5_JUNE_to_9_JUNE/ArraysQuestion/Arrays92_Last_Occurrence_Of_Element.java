package Assigment.Third_5_JUNE_to_9_JUNE.ArraysQuestion;

public class Arrays92_Last_Occurrence_Of_Element {
    public static void main(String[] args) {
        int arr[]={8,4,5,6,7,4,3,2,3,5,8};
        int element=7;

        for (int i=arr.length-1; i>=0; i--){
            if (arr[i]==element){
                System.out.println("Last occur of Element  " +arr[i]+ "  indices : "+i);
                return;
            }
        }

    }
}
