
import java.util.ArrayList;
import java.util.Collections;

// Problem Statement: Given an array, print all the elements which are leaders.
//  A Leader is an element that is greater than all of the elements on its right side in the array.

public class leaders_in_array {

    //brute force using nested for loop and add the leaders to array list 

    // public static void main(String[] args) {
    //     int a[]={10,22,12,3,0,6};
    //     ArrayList<Integer> b = new ArrayList<Integer>();
    //     for(int i =0;i<a.length;i++){
    //         int flag=0;
    //         for(int j=i+1;j<a.length;j++){
    //             if(a[i]<a[j]){
    //                 flag =1;
    //             }
    //         }
    //         if(flag==0){
    //             b.add(a[i]);
    //         }
    //     }
    //     System.out.println(b);
    // }



    //optimal solution 

    public static void main(String[] args) {
        int a[]={10,22,12,3,0,6};
        ArrayList<Integer> b = new ArrayList<Integer>();
        int max=Integer.MIN_VALUE;
        for(int i =a.length-1;i>=0;i--){
            if(a[i]>max){
                b.add(a[i]);
                max=a[i];
            }
        }

        // System.out.println(b);
        //since the we iterate from back to front in reverse order the output is in sorted order we just need to reverse it 
        //for that we use collection which has inbuilt reverse method to reverse an list
        Collections.reverse(b);
        System.out.println(b);

        
    }
}
