package Assigment.Second4_JUNE;

public class Frequency_Of_Given_Element_In_Array {
     public static int FrequencyElement(int arr[], int element){
         int frequency=0;
           for (int i=0; i<arr.length;i++){
               if (element==arr[i]){
                   frequency++;
               }
           }
         return frequency;
     }

    public static void main(String[] args) {
        int nums[] ={1,2,3,4,5,5,4,3,3,2,2,9,0,0,0,5,5,5,4,4,4,4,2,2,0};

        int element=4;

        System.out.println("Frequency of Element : " +element+" is : " +FrequencyElement(nums,element));


    }
}
