
import java.util.Arrays;


public class Bubble_sort {
    public static void main(String[] args) {
        int a [] = {1,2,4,66,9,2,3,4};
        int n = a.length;
        for (int i =0 ; i<n-1;i++){
            if(a[i]>a[i+1]){
                int temp =0;
                temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
                i=-1;
            }
    }
    System.err.println(Arrays.toString(a));
}
}
