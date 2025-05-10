// Nth Root of a Number using Binary Search

// Problem Statement: Given two numbers N and M, find the Nth root of M. The nth root of a number M is defined as a number X when raised to the power N equals M. If the 'nth root is not an integer, return -1.

// Examples
// Example 1:
// Input Format:
//  N = 3, M = 27
// Result:
//  3
// Explanation:
//  The cube root of 27 is equal to 3.


public class Nth_root_number {
    public static void main(String[] args) {
        int n =3;
        int m =27;
        int ans=-1;
        int low=1;
        int high=m;
        while(low<=high){
            int mid=(low+high)/2;
            if(fun(mid,n)==m){
                ans=mid;
                break;
            }
            if(fun(mid,n)<m){
                low=mid+1;
            }
            else{
                high=mid-1;
            }

            
        }
        System.err.println(ans);
    }
    public static int fun(int a,int n){
        int b=1;
        for(int i =1;i<=n;i++){
            b=b*a;
        }
        return b;
    }
}
