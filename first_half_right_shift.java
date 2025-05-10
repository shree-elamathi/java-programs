import java.util.Arrays;

public class first_half_right_shift {
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5};
        int n = (a.length+1)/2;
        int last=a[n-1];
        for (int i =n ; i>0;i--){
            a[i]=a[i-1];
        }
        a[0]=last;
        System.out.println(Arrays.toString(a));
    }
}
