// Problem Statement: Given an array Arr[] of integers, rearrange the numbers of 
// the given array into the lexicographically next greater permutation of numbers.

// If such an arrangement is not possible, it must rearrange to the lowest possible order (i.e., sorted in ascending order).



//Input format:
//  Arr[] = {1,3,2}

//  Output
//  : Arr[] = {2,1,3}

//  Explanation: 
//  All permutations of {1,2,3} are {{1,2,3} , {1,3,2}, {2,13} , {2,3,1} , {3,1,2} , {3,2,1}}.
//   So, the next permutation just after {1,3,2} is {2,1,3}.
import java.util.Arrays;

public class next_permutation {
    public static void main(String[] args) {
        int a[]={5,4,3,2,1};
        int index=-1;
        for(int i =a.length-2;i>=0;i--){
            if(a[i]<a[i+1]){
                index=i;
                break;
            }
        }


        if(index==-1){
            Arrays.sort(a);
            System.out.println(Arrays.toString(a));
        }
        else{
        
        for(int i=a.length-1;i>index;i--){
            
            if(a[i]>a[index]){
                int temp=a[i];
                a[i]=a[index];
                a[index]=temp;
                break;
            }
        }
        


        for(int i =index+1;i<a.length-1;i++){
            if(a[i]>a[i+1]){
                int temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
                i=index;
            }
        }
        System.out.println(Arrays.toString(a));
    }

    }
}
