
public class largest_difference {
     public static void main(String[] args) {
        int a [] = {1,2,3,4,5};
        int sum=0;
        int max=a[0],min=a[0];
        for(int i =0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
            else if(a[i]<min){
                min=a[i];
            }
        }
        int diff=max-min;
        System.err.println(diff);
        
        
    }
}
