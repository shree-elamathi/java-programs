
//Problem Statement: Given an integer array arr, find the contiguous subarray (containing at least one number) which
//has the largest sum and returns its sum and prints the subarray.

public class maximum_subarray_sum {
    
    
    //optimal solution using kadane algorithm

    //this code is used to find the maximum sum of the subarray 


    // public static void main(String[] args) {
    //     int a[]={-2,-3,4,-1,-2,1,5,-1};
    //     int sum=0;
    //     int max=0;
    //     for(int i=0;i<a.length;i++){

    //         sum+=a[i];
    //         if(max<sum){
    //             max=sum;
    //         }

    //         if(sum<0){
    //             sum=0;
    //         }
    //     }
    //     if(max<0){
    //         System.out.println(0);
    //     }
    //     else{
    //         System.out.println(max);
    //     }
        
    // }




    //optimal solution using kadane algorithm

     //this code is used to find the maximum sum of the subarray and print the start and end index of the subarray

     public static void main(String[] args) {
        int a[]={-2,-3,4,-1,-2,1,5,-1};
        int sum=0;
        int max=0;
        int start_ind=0,end_ind=0;
        int start=0;
        for(int i=0;i<a.length;i++){
            if(sum==0){
                start=i;
            }
            sum+=a[i];
            if(max<sum){
                max=sum;
                start_ind=start;
                end_ind=i;
            }

            if(sum<0){
                sum=0;
            }
        }
        if(max<0){
            System.out.println(0);
        }
        else{
            System.out.println(max);
            System.out.println("the index is "+start_ind+"-"+end_ind);
        }
        
    }


}
