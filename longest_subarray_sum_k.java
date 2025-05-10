//Problem Statement: Given an array and a sum k, we need to print the length of the longest subarray that sums to k.
public class longest_subarray_sum_k {


    //brute approach
    // public static void main(String[] args) {
    //     int a[]={1,2,3,1,1,1,4,2,3};
    //     int k=3;
    //     int length=0;
    //     for(int i=0;i<a.length;i++){
    //         int sum=0;
    //         for(int j=i;j<a.length;j++){
    //             sum+=a[j];
    //             if(sum==k){
    //                 int x=j-i+1;
    //                 length=Math.max(length,x);
                    
    //             }
    //             }
    //         }
    //         System.out.println(length);
            
    //     }
        

    // OPTIMAL SOLUTION
    /// this optimal solution i need to learn more *****
    public static void main(String[] args) {
        int a[]={1,2,3,1,1,1,4,2,3};
        int k=3;
        int length=0;
        int right=0;
        int left=0;
        int sum=a[0];
        while(right<a.length){
            while(left<=right && sum>k){
                sum-=a[left];
                left++;
            }
            if(sum==k){
                length =Math.max(length,right-left+1);
            }
            right++;
            if(right<a.length){
                sum+=a[right];
            }
        }
        System.out.println(length);


        }
        
    }

