// Find the Smallest Divisor Given a Threshold


// Problem Statement: You are given an array of integers 'arr' and an integer i.e. a threshold value 'limit'. Your task is to find the smallest positive integer divisor, such that upon dividing all the elements of the given array by it, the sum of the division's result is less than or equal to the given threshold value.

// Examples
// Example 1:
// Input Format:
//  N = 5, arr[] = {1,2,3,4,5}, limit = 8
// Result:
//  3
// Explanation:
//  We can get a sum of 15(1 + 2 + 3 + 4 + 5) if we choose 1 as a divisor. 
// The sum is 9(1 + 1 + 2 + 2 + 3)  if we choose 2 as a divisor. Upon dividing all the elements of the array by 3, we get 1,1,1,2,2 respectively. Now, their sum is equal to 7 <= 8 i.e. the threshold value. So, 3 is the minimum possible answer.


public class smallest_divisor_of_given_thershold {
    
}




//my leet code solution


// class Solution {
//     public int smallestDivisor(int[] a, int k) {
//         int low=1;
//         int high;
//         int max=Integer.MIN_VALUE;
//         for(int i :a){
//             if(i>max){
//                 max=i;
//             }
//         }
//         high=max;
//         int ans=-1;
//         while(low<=high){
//             int mid=(low+high)/2;
//             if(sum_divisor(a,mid)<=k){
//                 ans=mid;
//                 high=mid-1;
//             }
//             else{
//                 low=mid+1;
//             }
//         }
//         return ans;
//     }

//     public static int sum_divisor(int []a,int k){
//         int sum=0;
//         for(int i=0;i<a.length;i++){
//             sum+=Math.ceil((double)a[i]/(double)k);
//         }
//         return sum;
//     }
// }
