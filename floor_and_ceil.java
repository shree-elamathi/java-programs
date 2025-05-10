// Floor and Ceil in Sorted Array

// Problem Statement: You're given an sorted array arr of n integers and an integer x. Find the floor and ceiling of x in arr[0..n-1].
// The floor of x is the largest element in the array which is smaller than or equal to x.
// The ceiling of x is the smallest element in the array greater than or equal to x.

// Pre-requisite: Lower Bound & Binary Search

// Example 1:
// Input Format: n = 6, arr[] ={3, 4, 4, 7, 8, 10}, x= 5
// Result: 4 7
// Explanation: The floor of 5 in the array is 4, and the ceiling of 5 in the array is 7.

// Example 2:
// Input Format: n = 6, arr[] ={3, 4, 4, 7, 8, 10}, x= 8
// Result: 8 8
// Explanation: The floor of 8 in the array is 8, and the ceiling of 8 in the array is also 8.


public class floor_and_ceil {
    public static void main(String[] args) {
        int a[] ={3, 4, 4, 7, 8, 10};
        int x=5;
        int low=0;
        int high=a.length-1;
        int floor=-1; 
        int ceil=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]<=x){
               floor =a[mid];
               low=mid+1;
            }


            if(a[mid]>=x){
                ceil=a[mid];
                high=mid-1;
            }
        }
        System.out.println(floor+" "+ceil);
    }
}
