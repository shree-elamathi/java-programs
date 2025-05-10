
import java.util.Arrays;

public class reverse_element_array {
    public static void main(String[] args) {
        int a [] = {123,45,79};
        for(int i =0;i<a.length;i++){
            a[i]=rev(a[i]);
        }
        System.err.println(Arrays.toString(a));
        
    }

    public static int rev(int num) {
        int rem,rev=0;
        while(num>0){
            rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        return rev;
    }
}
