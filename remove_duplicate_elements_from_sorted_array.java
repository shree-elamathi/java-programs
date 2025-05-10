
import java.util.Arrays;
public class remove_duplicate_elements_from_sorted_array {
    public static void main(String[] args) {
        int a [] = {1,1,2,2,2,3,3};
        int i=0;
        for(int j =1;j<a.length;j++){
            if(a[i]!=a[j]){
                int temp=a[j];
                a[j]=a[i+1];
                a[i+1]=temp;
                i++;
                
            }
        }
        int b[]=new int[i+1];
        for(int j=0;j<i+1;j++){
            b[j]=a[j];
} 
System.err.println(Arrays.toString(b));
}
}
