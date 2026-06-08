package Assigment.Second4_JUNE;

public class Largest_Element_In_Array {
    public static void main(String[] args) {
        int nums[]={12,34,45,45,64,67,78,98,1023};
        int nums2[]={12,34,45,45};

        //Using Math function
        int largest=Integer.MIN_VALUE;
        for (int v:nums){
            largest=Math.max(largest,v);
        }
        System.out.println("Largest Value in array :  "+largest);

        //Without using math function
        int max=nums[0];
        for (int i=0; i<nums2.length; i++){
            if (nums[i]>=max){
                max=nums[i];
            }
        }
        System.out.println("Max value :" + max);

    }
}
