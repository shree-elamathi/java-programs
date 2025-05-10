
import java.util.Arrays;



public class first_and_last_position_of_elemetn_sorted_array {


public static void main(String[] args) {
    int a[]={1,2,2,2,3,4,5};
    int x=2;
    int b[]=new int[2];
    b[0]=first(a,x);
    b[1]=last(a,x);
    System.err.println(Arrays.toString(b));
}

public static int first(int []a,int x){
    int n=a.length;
    int low=0;
    int high=n-1;
    int first=-1;
    while(low<=high){
        int mid=(low+high)/2;
        if(a[mid]==x){
            first=mid;
            high=mid-1;
        }
        else if(a[mid]<x){
            low=mid+1;
        }

        else{
            high=mid-1;
        }
    }
    return first;
}


public static int last(int []a,int x){
    int n=a.length;
    int low=0;
    int high=n-1;
    int last=-1;
    while(low<=high){
        int mid=(low+high)/2;
        if(a[mid]==x){
            last=mid;
            low=mid+1;
        }
         else if(a[mid]<x){
            low=mid+1;
        }
        else{
            high=mid-1;
        }
    }
    return last;
}
}




//Count Occurrences in Sorted Array



// Problem Statement: You are given a sorted array 
// containing N integers and a number X, you have to find the occurrences of X in the given array.


// if the answer not -1 then 

// for this we just need to find the last occurence - first occurence +1















