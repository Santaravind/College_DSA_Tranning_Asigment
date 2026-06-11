package Assigment.Third_5_JUNE_to_9_JUNE.ArraysQuestion;

public class Arrays77_Move_All_Zero_Elements_End {
    public static void main(String[] args) {
        int arr[]={2,3,4,0,5,0,44,6,0,9,0,5,9};


        for(int i=0; i<arr.length; i++){
            if (arr[i]==0){
                int temp=arr[i];
                int j=i;
                while (j<arr.length-1){
                    arr[j]=arr[j+1];
                    j++;
                }
                arr[arr.length-1]=temp;

            }
        }

        System.out.println("All zero in end  : ");

        for (int v : arr){
            System.out.print(v + " ");
        }

    }
}
