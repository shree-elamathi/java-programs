
import java.util.Arrays;


public class frequency_all_elements {
    public static void main(String[] args) {
        int a[]={1,2,2,3,4,4,4,5};
        for(int i =0;i<a.length;i++){
        int count=1;
        for (int j=i+1; j<a.length;j++){
            if(a[i]==a[j]){
                count++;
                a[j]=Integer.MAX_VALUE;
            }
        }
        if(a[i]!=Integer.MAX_VALUE){
        System.err.println(a[i]+" - "+count);
        }
    }
    System.err.println(Arrays.toString(a));
    }
}
