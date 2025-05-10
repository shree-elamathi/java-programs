import java.util.Arrays;

public class majority_element {
    public static void main(String[] args) {
        int a[]={6,6,6,7,7};
        Arrays.sort(a);
        int max=0;
        int count=1;
        int val=a[0];
        for(int i=0;i<a.length-1;i++){
            if(a[i]==a[i+1]){
                count++;
                System.out.println(count);
            }
            if(count>max){
                max=count;
                val=a[i];
                
            }
            if(a[i]!=a[i+1]){
                count=1;
            }
        }
        
        System.out.println(val);
    }
}
