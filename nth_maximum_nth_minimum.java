
public class nth_maximum_nth_minimum {
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5};
        int k=3;
        int max=a[0];
        for(int j =0;j<k;j++){
         max=a[0];
        for(int i =0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        for(int i =0;i<a.length;i++){
            if (max==a[i]){
                a[i]=Integer.MIN_VALUE;
            }
        }  
        
    }
    System.out.println(max); 
        
    }
}
