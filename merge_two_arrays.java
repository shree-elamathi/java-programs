
import java.util.Arrays;

public class merge_two_arrays {
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5};
        int b[]={6,7,8,9};
        int c[]=new int [a.length+b.length];
        for(int i=0;i<c.length;i++){
         if(i<a.length){
            c[i]=a[i];
         }
         else{
            c[i]=b[i-a.length]; 
         }
    }
    System.err.println(Arrays.toString(c));
    }
}
