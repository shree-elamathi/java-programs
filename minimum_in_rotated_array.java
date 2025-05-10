// Minimum in Rotated Sorted Array


// Problem Statement: Given an integer array arr of size N, sorted in ascending order (with distinct values). Now the array is rotated between 1 to N times which is unknown. Find the minimum element in the array. 

// Pre-requisites: Search in Rotated Sorted Array I,  Search in Rotated Sorted Array II & Binary Search algorithm

// Examples
// Example 1:
// Input Format:
//  arr = [4,5,6,7,0,1,2,3]
// Result:
//  0
// Explanation:
//  Here, the element 0 is the minimum element in the array.




class minimum_in_rotated_array{
    public static void main(String[] args) {
        int a[]={4,5,6,7,0,1,2};
        if(a.length==1){
            System.out.println(a[0]);
        }

        if(a.length==0){
            System.out.println("-1");
        }

        int low=0;
        int high=a.length-1;
        int min=Integer.MAX_VALUE;
        while(low<=high){
            int mid=(low+high)/2;
            
            //find the sorted ARRAY 
            if(a[low]<=a[mid]){
                if(a[low]<min){
                    min=a[low];
                }
                low=mid+1;
            }

            else{
                if(a[mid]<min){
                    min=a[mid];
                }
                
                high=mid-1;
            }
        }
        System.out.println(min);
    }
}