package Assigment.Third_5_JUNE_to_9_JUNE.ArraysQuestion;

public class Arrays70_Merge_Two_Arrays {
    public static void main(String[] args) {
        int arr1[]={23,4,56,2};
        int arr2[]={45,67,3,2};
        int newMargeArry[]=new int[arr2.length+arr1.length];

        int j=0;
        while (j<arr1.length){
            newMargeArry[j]=arr1[j];
            j++;
        }
        int i=0;
        while (i<arr2.length){
            newMargeArry[j++]=arr2[i++];
        }


        for (int v : newMargeArry){
            System.out.print(v+ " ");
        }
    }
}
