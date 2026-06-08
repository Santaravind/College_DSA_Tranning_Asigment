package Assigment.Second4_JUNE;

public class Sum_Of_All_Element_In_Array {
    public static void main(String[] args) {
        int arr[]={12,34,56,76,78,3,4,5,-1};
         int sum=0;
         for (int i=0; i<arr.length; i++){
             sum+=arr[i];
         }

        System.out.println(sum);

    }
}
