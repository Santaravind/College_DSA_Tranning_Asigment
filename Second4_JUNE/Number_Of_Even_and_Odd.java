package Assigment.Second4_JUNE;

public class Number_Of_Even_and_Odd {
    public static void main(String[] args) {
        int num[]={2,3,4,5,6,12,34,23,78,98,90};
        int even=0,odd=0;

         for (int n:num){
             if (n%2==0){
                 even++;
             }else {
                 odd++;
             }
         }
        System.out.println("Number of even in array : "+even);
        System.out.println("Number of odd in array : "+ odd);

    }
}
