
//Problem Statement: Given a non-empty array of integers arr, every element appears twice except for one. Find that single one.

public class number_appear_once {


    //brute force approach using linear search

    // public static void main(String[] args) {
    //     int a[]={1,1,2,3,3,4,4,5,5};
        
    //     for(int i =0;i<a.length;i++){
    //         int count =0;
    //         for(int j=0;j<a.length;j++){
    //             if(a[i]==a[j]){
    //                 count++;
    //             }
    //         }
    //         if(count==1){
    //             System.out.println(a[i]);
    //             break;
    //         }
    //     }
    // }


    //better solution using hash

    // public static void main(String[] args) {
    //     int a[]={1,1,2,3,3,4,4,5,5};
    //     int max=0;
    //     for(int i =0;i<a.length;i++){
    //         if(a[i]>max){
    //             max=a[i];
    //         }
    //     }
    //     int hash []=new int[max+1];
    //     for (int i =0 ;i<a.length;i++){
    //         hash[a[i]]+=1;
    //     }

    //     for(int i =0;i<hash.length;i++){
    //         if(hash[i]==1){
    //             System.out.println(i);
    //         }
    //     }

    // } 



    //optimal solution using xor


    public static void main(String[] args) {
        int a[]={1,1,2,3,3,4,4,5,5};
        int xor=0;
        for(int i =0;i<a.length;i++){
            xor=xor^a[i];
        }
        System.out.println(xor);
    }
}
