package Assigment.Third_5_JUNE_to_9_JUNE.ArraysQuestion;

public class Arrays71_Two_Commen_Element {
    public static void main(String[] args) {
        int arr1[]={23,4,56,2};
        int arr2[]={45,67,3,2};
        int i=0;
        while(i<arr1.length){
            int m=arr1[i];
            int j=0;
            while (j<arr2.length){
                if(m==arr2[j]){
                    System.out.println("Element present in both arrays : "+ m);
                }
                j++;
            }
            i++;
        }
    }
}
