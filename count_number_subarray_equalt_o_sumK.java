
// Problem Statement: Given an array of integers and an integer k, return the total number of subarrays whose sum equals k.

// A subarray is a contiguous non-empty sequence of elements within an array.

// Pre-requisite: Longest subarray with given sum

// Example 1:
// Input Format:
//  N = 4, array[] = {3, 1, 2, 4}, k = 6
// Result:
//  2
// Explanation:
//  The subarrays that sum up to 6 are [3, 1, 2] and [2, 4].


 class count_number_subarray_equalt_o_sumK{

    //brute force solution
//    public static void main(String[] args) {
//         int a[]={1,2,3,1,1,1,4,2,3};
//         int k=3;
//         int count=0;
//         for(int i=0;i<a.length;i++){
//             int sum=0;
//             for(int j=i;j<a.length;j++){
//                 sum+=a[j];
//                 if(sum==k){
//                     count++;
//                 }
//                 }
//             }
//             System.out.println(count);
            
//         }


//optimal solution using hashmap



// import java.util.HashMap;

// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         HashMap<Integer, Integer> map = new HashMap<>();  // Step 1: Create a HashMap to store prefix sums and their frequency
//         map.put(0, 1);  // Step 2: Initialize the HashMap with {0:1} to handle cases where subarray sum itself equals k
        
//         int ans = 0, sum = 0;  // Step 3: Initialize variables, 'ans' to count subarrays, 'sum' to track the running sum

//         for (int num : nums) {  // Step 4: Iterate through the array
//             sum += num;  // Step 5: Update the prefix sum
            
//             ans += map.getOrDefault(sum - k, 0);  // Step 6: Check if (sum - k) exists in the HashMap, add its frequency to 'ans'

//             map.put(sum, map.getOrDefault(sum, 0) + 1);  // Step 7: Store the current prefix sum in the HashMap and update its frequency
//         }
        
//         return ans;  // Step 8: Return the final count of subarrays that sum to 'k'
//     }
// }


}