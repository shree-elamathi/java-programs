import java.util.Arrays;

public class second_half_right_shift {
      public static void main(String[] args) {
        int a [] = {1,2,3,4,5};
        int n = (a.length+1)/2;
        int last=a[a.length-1];
        for (int i =a.length-1 ; i>n;i--){
            a[i]=a[i-1];
        }
        a[n]=last;
        System.out.println(Arrays.toString(a));
    }
}
