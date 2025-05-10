// Implement Upper Bound


// Problem Statement: Given a sorted array of N integers and an integer x, write a program to find the upper bound of x.

// Pre-requisite: Binary Search algorithm

// Example 1:
// Input Format:
//  N = 4, arr[] = {1,2,2,3}, x = 2
// Result:
//  3
// Explanation:
//  Index 3 is the smallest index such that arr[3] > x.


public class upper_bound {
    public static void main(String[] args) {
        int x=7;
        int a[]={1,2,3,4,5,6,7,8,9};
        int low=0;
        int high=a.length-1;
        int ans=a.length;
        while(low<=high){
            int mid=(low+high)/2;
            if(x<a[mid]){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println(ans);
    }
}
