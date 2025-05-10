//Problem Statement: Given an array of N integers, write a program to return an element 
//that occurs more than N/2 times in the given array. 
//You may consider that such an element always exists in the array.

public class majaority_elements {

    //better solution

    // public static void main(String[] args) {
    //     int a[]={2,2,1,1,2,2,4};
    //     int hash[]=new int[a.length+1];
    //     for(int i=0;i<a.length;i++){
    //         hash[a[i]]+=1;
    //     }
    //     for(int i =0;i<a.length;i++){
    //         if(hash[a[i]]>a.length/2){
    //             System.out.println("element is "+a[i]);
    //             break;
    //         }
    //     }
    // }


    //optimal solution
    //moore voting algorithm 

    public static void main(String[] args) {
         int a[]={2,2,1,1,2,2,4};
         int count=0;
         int element=0;
         for(int i =0;i<a.length;i++){
            if(count ==0){
                element=a[i];
                count=1;
            }

            else if(a[i]==element){
                count++;
            }

            else{
                count--;
            }
            
         }
         int count1=0;
         
         // this below for loop is to check whether the respected element 
         //satisfy the given condition n/2
         // if in the question they say that an element  that satify the condition exit always 
         // then there is no need of another for loop to check

         for(int i =0;i<a.length;i++){
            if(a[i]==element){
                count1++;
            }
         }
         if(count1>a.length/2){
            System.out.println("the element is "+ element);
         }
    }

}
