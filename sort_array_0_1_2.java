
import java.util.Arrays;


//without using inbuilt sort functions. ( Expected: Single pass-O(N) and constant space)

public class sort_array_0_1_2 {
    
    //brute force solution by using sorting
    // public static void main(String[] args) {
    //     int a[]={1,2,0,0,0,1,2,1,2,1};
    //     for(int i=0;i<a.length-1;i++){
    //         if(a[i]>a[i+1]){
    //             int temp=0;
    //             temp=a[i];
    //             a[i]=a[i+1];
    //             a[i+1]=temp;
    //             i=-1;
    //         }
    //     }
    //     System.out.println(Arrays.toString(a));
    // }



    //better solution is by counting the number of 0 1 2 in array and change the element present to it .abstract 

//     public static void main(String[] args) {
//         int a[]={1,2,0,0,0,1,2,1,2};
//         int count_0=0;
//         int count_1=0;
//         int count_2=0;
//         for(int i =0;i<a.length;i++){
//             if(a[i]==0){
//                 count_0++;
//             }
//             if(a[i]==1){
//                 count_1++;
//             }
//             if(a[i]==2){
//                 count_2++;
//             }
//         }

//         for(int i =0;i<count_0;i++){
            
//             a[i]=0;
//         }
//         for(int i=count_0;i<count_0+count_1;i++){
//             a[i]=1;
//         }
//         for(int i=count_1+count_0;i<count_0+count_1+count_2;i++){
//             a[i]=2;
//         }

//         System.out.println(Arrays.toString(a));

// }



// optimal solution here we use the DNF algorithm 
//expalined in the note 
// deutch national flag algorithm 


public static void main(String[] args) {
    int a[]={1,2,0,0,0,1,2,1,2};
    int mid=0;
    int low=0;
    int high=a.length-1;
    while(mid<=high){
        if(a[mid]==0){
            int temp=0;
            temp=a[mid];
            a[mid]=a[low];
            a[low]=temp;
            mid++;
            low++;
        }
        if(a[mid]==1){
            mid++;
        }
        if(a[mid]==2){
            int temp=0;
            temp=a[mid];
            a[mid]=a[high];
            a[high]=temp;
            high--;
        }
    }
    System.out.println(Arrays.toString(a));
}
}






