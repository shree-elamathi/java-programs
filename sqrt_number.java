// Finding Sqrt of a number using Binary Search


// Problem Statement: You are given a positive integer n. Your task is to find and return its square root. If ‘n’ is not a perfect square, then return the floor value of 'sqrt(n)'.

// Note: The question explicitly states that if the given number, n, is not a perfect square, our objective is to find the maximum number, x, such that x squared is less than or equal to n (x*x <= n). In other words, we need to determine the floor value of the square root of n.

// Examples
// Example 1:
// Input Format:
//  n = 36
// Result:
//  6
// Explanation:
//  6 is the square root of 36.

// Example 2:
// Input Format:
//  n = 28
// Result:
//  5
// Explanation:
//  Square root of 28 is approximately 5.292. So, the floor value will be 5.



class sqrt_number{
    public static void main(String args[]){
        int n =36;
        int low=1;
        int high=36;
        int ans=1;
        while(low<=high){
            int mid=(low+high)/2;
            if(mid*mid<=n){
                ans=mid;
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        System.out.println(ans);
    }
}