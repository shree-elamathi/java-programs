
public class sum_of_pair_of_target {
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5};
        int target=5;
        for(int i =0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==target){
                    System.err.println(a[i]+","+a[j]);
                }
            }
        }
        
    }
}
