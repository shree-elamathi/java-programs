
import java.util.Arrays;

class Selection_sort{
    public static void main(String[] args) {
        int a [] = {13,46,24,52,20,9};
        int n = a.length;
        for (int i =0 ; i<=n-2;i++){
            int min =i;
            for(int j =i;j<=n-1;j++){
                if(a[min]>a[j]){
                    min=j;
                }
            }
        int temp =0;
        temp = a[min];
        a[min]=a[i];
        a[i]=temp;
        }
        System.err.println(Arrays.toString(a));
    }
}