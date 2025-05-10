// Problem Statement: Given an array of length N. Peak element is defined as the element greater than both of its neighbors. Formally, if 'arr[i]' is the peak element, 'arr[i - 1]' < 'arr[i]' and 'arr[i + 1]' < 'arr[i]'. Find the index(0-based) of a peak element in the array. If there are multiple peak numbers, return the index of any peak number.

// Note: For the first element, the previous element should be considered as negative infinity as well as for the last element, the next element should be considered as negative infinity.

// Pre-requisite: Binary Search Algorithm

// Examples
// Example 1:
// Input Format: arr[] = {1,2,3,4,5,6,7,8,5,1}
// Result: 7
// Explanation: In this example, there is only 1 peak that is at index 7.

// Example 2:
// Input Format: arr[] = {1,2,1,3,5,6,4}
// Result: 1
// Explanation: In this example, there are 2 peak numbers that are at indices 1 and 5. We can consider any of them.




public class findPeakElement {

    public static void main(String[] args) {
        int a[]={1,2,3,1};
        System.err.println(findPeakElement(a));
    }
    public static int findPeakElement(int a[]) {
        int n=a.length;
        if(n==0){
            return -1;
        }
        if(n==1){
            return 0;
        }

        if(a[0]>a[1]){
            return 0;
        }

        if(a[n-1]>a[n-2]){
            return n-1;
        }

        int low=1;
        int high=n-2;
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]>a[mid+1] && a[mid]>a[mid-1]){
                return mid;
            }

            else if(a[mid]>a[mid+1]){
                high=mid-1;
            }

            else {
                low=mid+1;
            }
        }
        return -1;
    }
}
