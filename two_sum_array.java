
import java.util.Arrays;

/*
 * Problem Statement: Given an array of integers arr[] and an integer target.

1st variant: Return YES if there exist two numbers such that their sum is equal to the target. Otherwise, return NO.

2nd variant: Return indices of the two numbers such that their sum is equal to the target. Otherwise, we will return {-1, -1}.

Note: You are not allowed to use the same element twice. Example: If the target is equal to 6 and num[1] = 3, then nums[1] + nums[1] = target is not a solution.
 * 
*/

public class two_sum_array {



    //brute force solution nested for loop

    // public static void main(String[] args) {
    //     int a[]={1,2,6,4,5,8,11};
    //     int target=14;
    //     for(int i =0;i<a.length;i++){
    //         for (int j=i+1;j<a.length;j++){
    //             if(a[i]+a[j]==target){
    //                 System.out.println("index :"+i+","+j);
    //             }
    //         }
    //     }
    // }


    //better solution using hashmap

    // public static int[] twoSum(int n, int []arr, int target) {
    //     int[] ans = new int[2];
    //     ans[0] = ans[1] = -1;
    //     HashMap<Integer, Integer> mpp = new HashMap<>();
    //     for (int i = 0; i < n; i++) {
    //         int num = arr[i];
    //         int moreNeeded = target - num;
    //         if (mpp.containsKey(moreNeeded)) {
    //             ans[0] = mpp.get(moreNeeded);
    //             ans[1] = i;
    //             return ans;
    //         }

    //         mpp.put(arr[i], i);
    //     }
    //     return ans;
    // }

    // public static void main(String args[]) {
    //     int n = 5;
    //     int[] arr = {2, 6, 5, 8, 11};
    //     int target = 14;
    //     int[] ans = twoSum(n, arr, target);
    //     System.out.println("This is the answer for variant 2: [" + ans[0] + ", "
    //                        + ans[1] + "]");

    // }



    //optimal solution only for to say where yes or no 

    public static void main(String[] args) {
        int a[]={2,6,5,8,11};
        int target=14;
        int i =0;
        int j =a.length-1;
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        while(i<j){
            if(a[i]+a[j]==target){
                System.out.println(i+","+j+" YES");
                break;
            }
            if(a[i]+a[j]>target){
                j--;
            }
            if(a[i]+a[j]<target){
                i++;
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
