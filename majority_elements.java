//Majority Elements(&gt;N/3 times) | Find the elements that appears more than N/3 times in the array


// Problem Statement: Given an array of N integers. 
// Find the elements that appear more than N/3 times in the array. If no such element exists, return an empty vector.


import java.util.ArrayList;
import java.util.List;

public class majority_elements {


    //brute force by just using the for loop and find the count of each element in the array and storing it in the lis 
    // public static void main(String[] args) {
    //      List<Integer> list = new ArrayList<>();
    //      int a[]={1,1,1,3,3,2,2,2};
    //      for(int i =0;i<a.length;i++){
    //         int count=0;
    //         if(list.contains(a[i])){
    //             //this if is just used to avoid the elements that are already added in the list 
    //         }

    //         else {
    //             for(int j=0;j<a.length;j++){
    //                 if(a[i]==a[j]){
    //                     count++;
    //                 }
    //             }
    //             if(count>(a.length/3)){
    //                 list.add(a[i]);
    //             }
    //         }
    //     }
    //      System.out.println(list);
    // }






    // better solution is by using an hashmap











    //optimal solution is by using the moore voting algorithm 


        public static void main(String[] args) {
            int a[]={1,1,1,3,3,2,2,2};
            int n=a.length;
            int count1=0;
            int count2=0;
            int el1=Integer.MIN_VALUE;
            int el2=Integer.MIN_VALUE;
            List<Integer> list=new ArrayList<>();
    
            if(a.length==1){
                list.add(a[0]);
            }
    
            else{
            for(int i =0;i<n;i++){
                if(count1==0 && el2!=a[i]){
                    el1=a[i];
                    count1=1;
    
                }
    
                else if(count2==0 && el1!=a[i]){
                    el2=a[i];
                    count2=1;
                    
                }
    
                else if(el1==a[i]){
                    count1++;
                }
    
                else if(el2==a[i]){
                    count2++;
                }
    
                else{
                    count1--;
                    count2--;
                }
            }
    
            count1=0;
            count2=0;
            int min= (int)(n/3)+1;
            for(int i =0;i<n;i++){
                if(a[i]==el1){
                    count1++;
                }
    
                else if(a[i]==el2){
                    count2++;
                }
            }
            if(count1>=min){
                list.add(el1);
            }
    
            if(count2>=min){
                list.add(el2);
            }
            }
    
            System.out.println(list);
    
            
        }
    }




