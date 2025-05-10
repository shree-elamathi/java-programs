
import java.util.Arrays;



public class union_array {
    public static void main(String[] args) {
        int a1[]={1,2,3,4,5,3,5,7,0,2};
        int a2[]={1,2,2,3,4,4,6,5,7,8,9};

        int temp[]=new int [a1.length+a2.length];

        //merge two arrays 

        for(int i =0;i<temp.length;i++){
            if(i<a1.length){
                temp[i]=a1[i];
            }

            else{
                temp[i]=a2[i-a1.length];
            }
        }

        //sort the array temp which is the merge of the two given array

        for(int i =0;i<temp.length-1;i++){
            if(temp[i]>temp[i+1]){
                int t=temp[i+1];
                temp[i+1]=temp[i];
                temp[i]=t;
                i=-1;
            }
        }

        // remove the duplicates in sorted array 
        
        int k=0;
        for(int j =1;j<temp.length;j++){
            if(temp[k]!=temp[j]){
                int t=temp[j];
                temp[j]=temp[k+1];
                temp[k+1]=t;
                k++;
                
            }
        }

        // create an union array and copy the elements 
        
        int union []=new int[k+1];
        for(int j=0;j<k+1;j++){
            union [j]=temp[j];
        }
        System.err.println(Arrays.toString(union));
    }
}
