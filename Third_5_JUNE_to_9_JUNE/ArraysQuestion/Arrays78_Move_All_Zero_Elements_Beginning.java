package Assigment.Third_5_JUNE_to_9_JUNE.ArraysQuestion;

public class Arrays78_Move_All_Zero_Elements_Beginning {
    public static void main(String[] args) {
        int arr[]={2,3,4,0,5,0,44,6,0,9,0,5,9};


        for(int i=0; i<arr.length; i++){
            if (arr[i]==0){
                int temp=arr[i];
                int j=i;
                while (j>0){
                    arr[j]=arr[j-1];
                    j--;
                }
                 arr[0]=temp;
            }
        }

        System.out.println("All zero in beginning : ");
        for (int v:arr){
            System.out.print(v+ " ");
        }
    }
}
