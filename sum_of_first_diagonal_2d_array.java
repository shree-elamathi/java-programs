
import java.util.Arrays;

public class sum_of_first_diagonal_2d_array {
    public static void main(String[] args) {
        int a [][] = {{1,2,3},{4,5,6},{7,8,9}};
        int sum=0;
        for(int i =0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(i==j){
                    sum+=a[i][j];
                }
            }
        }
        System.err.println(Arrays.deepToString(a));
        System.out.println(sum);
        
    }
}
