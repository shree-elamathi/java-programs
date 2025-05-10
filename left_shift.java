import java.util.Arrays;

public class left_shift {
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5};
        int n = a.length;
        int first=a[0];
        for (int i =0 ; i<n-1;i++){
            a[i]=a[i+1];
        }
        a[a.length-1]=first;
        System.out.println(Arrays.toString(a));
    }
}
