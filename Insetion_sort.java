import java.util.Arrays;

public class Insetion_sort {
    public static void main(String[] args) {
        int a [] = {13,46,24,52,20,9};
        int n = a.length;
        for (int j =0 ; j<=n-1;j++){
            int i=j;
            while(i>0 && a[i]<a[i-1])
            {
                int temp =0;
                temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
                i--;
            }
    }
    System.err.println(Arrays.toString(a));
} 
}


