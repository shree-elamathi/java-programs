
import java.util.Arrays;

public class remove_duplicate {
    public static void main(String[] args) {
        int a [] = {1,2,2,3,3,3,4,4,5};
        for(int i =0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    a[j]=Integer.MAX_VALUE;
                }
            }
        }
        int count =0;
        for(int i =0;i<a.length;i++){
            if(a[i]==Integer.MAX_VALUE){
                count++;
            }
        }
        int b[]=new int [a.length-count];
        for(int i =0,k=0;i<a.length;i++){
            if(a[i]!=Integer.MAX_VALUE){
                b[k]=a[i];
                k++;
            }
        }
        System.err.println(Arrays.toString(b));
    }
}
