
import java.util.Arrays;

// middle function which create a new array wtihout the first and last element 

public class middle_function {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5};
        int a[]=new int [array.length-2];
        for(int i=1;i<array.length-1;i++){
            a[i]=array[i];
        }
        System.out.println(Arrays.toString(a));
    }
    
}

