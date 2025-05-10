
//You need to find the length of the longest sequence which contains the consecutive elements.

// Example 1:
// Input:
//  [100, 200, 1, 3, 2, 4]

// Output:
//  4

// Explanation:
//  The longest consecutive subsequence is 1, 2, 3, and 4.

import java.util.HashSet;

public class largest_consecutive_sequence {



    //brute force solution 

    // public static void main(String[] args) {
    //     int a[]={100,200,1,3,2,4,5,6};
    //     int count =0;
    //     for(int i =0;i<a.length;i++){
    //         int cur_count=1;
    //         int x=a[i];
    //         while(linear_search(a,x+1)==true){
    //             x=x+1;
    //              cur_count +=1;

    //             if(cur_count>count){
    //                 count=cur_count;
    //             }
    //         }
            
    //     }
    //     System.out.println(count);
       
    // }
    // public static boolean  linear_search(int[]a,int x) {
    //     for(int i =0;i<a.length;i++){
    //         if(a[i]==x){
    //             return true;
    //         }
    //     }
            
    //     return false;
    // }




    //better solution 


//     [100,4,200,1,3,2]
// [0,3,7,2,5,8,4,6,0,1]
// [1,2,0,1]
// [0]
// [0,0]


    // public static void main(String[] args) {
    //     int a[]= {100,200,1,3,2,4,5,6};
    //     Arrays.sort(a);
    //     int count=1;
    //     int longest=1;
    //     int last_smallest=a[0];

    //     for(int i =0;i<a.length;i++){

    //         if(a[i]==last_smallest+1){
    //             count++;
    //             last_smallest=a[i];
    //         }

    //         else if(a[i]==last_smallest){
    //             continue;
    //         }

    //         else if(a[i]!=last_smallest+1){
    //             count=1;
    //             last_smallest=a[i];
    //         }

    //         longest=Math.max(longest,count);
    //     }

    //      System.out.println(longest);
    // }



    //optimal solution using hashset
    //hs.contains return wheter the elements is present or not 
    // .add( ) method is used to add an element in hashset
    

    public static void main(String[] args) {
        int a[]={100,200,1,3,2,4,5,6};
        HashSet<Integer> hs = new HashSet<>();
        int longest=0;
        for(int i =0;i<a.length;i++){
            hs.add(a[i]);
        }
        for(int i:hs){
            if (!hs.contains(i - 1)){
                int count=1;
                int x=i;
                while(hs.contains(x + 1)){
                    count++;
                    x=x+1;
                }
                longest=Math.max(longest,count);

            }
        }
        System.out.println(longest);
        
    }

}
