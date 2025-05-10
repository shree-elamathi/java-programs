//Implement Lower Bound



// Problem Statement: Given a sorted array of N integers and an integer x, write a program to find the lower bound of x.

// Pre-requisite: Binary Search algorithm

// Example 1:
// Input Format:
//  N = 4, arr[] = {1,2,2,3}, x = 2
// Result:
//  1
// Explanation:
//  Index 1 is the smallest index such that arr[1] >= x.




// Search Insert Position



// Problem Statement: You are given a sorted array arr of distinct values and a target value x. You need to search for the index of the target value in the array.

// If the value is present in the array, then return its index. Otherwise, determine the index where it would be inserted in the array while maintaining the sorted order.

// Pre-requisite: Lower Bound & Binary Search



public class lower_bound {
    public static void main(String[] args) {
        int x=7;
        int []a={1,2,3,4,5,6,7,8,9,10};
       int low=0;
       int high=a.length-1;
       int ans=a.length;
       while(low<=high){
           int mid=(low+high)/2;
          
            if(x<=a[mid]){
               ans=mid;
               high=mid-1;
           }
 
           else if(x>a[mid]){
               low=mid+1;
           }
       }
       System.out.print(ans);
    }
}
