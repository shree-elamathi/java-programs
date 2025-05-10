
import java.util.Arrays;



//There’s an array ‘A’ of size ‘N’ with an equal number of positive and negative elements. Without altering the relative order of positive and negative elements, you must return an array of alternately positive and negative values.

//Note: Start the array with positive elements.
public class Rearrange_Array_Elements_by_Sign {

    //brute force solution bby creating two array for positive elements and negative elements
    //since all main array contains equal number of positive and negative elements 
    //so if n is size and it has n/2 pos and n/2 neg elements in it so size of both array is n/2
    // and in output the positive elements are in even index and negative elements are in odd index 

    // public static void main(String[] args) {
    //     int a[]={3,1,-2,-5,2,-4};
    //     int pos[]=new int[a.length/2];
    //     int neg[]=new int[a.length/2];
    //     for(int i =0,j=0,k=0;i<a.length;i++){
    //         if(a[i]>=0){
    //             pos[j]=a[i];
    //             j++;
    //         }
    //         if(a[i]<0){
    //             neg[k]=a[i];
    //             k++;
    //         }
    //     }

    //     for(int i =0;i<a.length/2;i++){
    //         a[i*2]=pos[i];
    //         a[(i*2)+1]=neg[i];
    //     }
    //     System.out.println(Arrays.toString(a));
    // }



    //optimal solution
    //simple as it is by using a two point index one for positive start if the element is positive from 0 to next by adding +2 since it is even index 
    // next for negative start if the element is negative form 1 and add +2 for next since it is odd index in output 


    // public static void main(String[] args) {
    //     int a[]={3,1,-2,-5,2,-4};
    //     int op[]=new int [a.length];
    //     int pos_index=0,neg_index=1;
    //     for(int i =0;i<a.length;i++){
    //         if(a[i]>=0){
    //             op[pos_index]=a[i];
    //             pos_index+=2;
    //         }
    //         if(a[i]<0){
    //             op[neg_index]=a[i];
    //             neg_index+=2;
    //         }

    //     }
    //     System.out.println(Arrays.toString(op));
    // }



    //next variety if the number of the pos and neg elements are not equal 

    
}
