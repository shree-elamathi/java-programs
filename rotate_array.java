
import java.util.Arrays;




// Example 1:
// Input:
//  [[1,2,3],[4,5,6],[7,8,9]]

// Output
// : [[7,4,1],[8,5,2],[9,6,3]]

// Explanation:
//  Rotate the matrix simply by 90 degree clockwise and return the matrix.

class rotate_array{
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};

        //transpose
        for(int i =0;i<a.length-1;i++){
            for(int j=i+1;j<a[0].length;j++){
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }


        
        
        //revere each row in matrixafter tanspose

        for(int i =0;i<a[0].length;i++){
            int start=0;
            int end=a[0].length-1;
            while(start<end){
                int temp=a[i][start];
                a[i][start]=a[i][end];
                a[i][end]=temp;

                
            // Increment start and decrement
            // end for next pair of swapping
            start++;
            end--;
            }

        }

        System.out.println(Arrays.deepToString(a));

       

    }



    // leet code optimla solution 

        // public void rotate(int[][] matrix) {
        //     int n=matrix.length;
        //     int m=matrix[0].length;
        //     for(int i=0;i<n;i++){
        //         for(int j=0;j<i;j++){
        //             int temp=matrix[i][j];
        //             matrix[i][j]=matrix[j][i];
        //             matrix[j][i]=temp;
        //         }
        //     }
        //     for(int i=0;i<n;i++){
        //         reverse(matrix[i],0,m-1);
        //     }
        // }
        // public int[] reverse(int[] matrix,int start,int end){
        //     while(start<end){
        //         int temp=matrix[end];
        //         matrix[end]=matrix[start];
        //         matrix[start]=temp;
        //         start++;
        //         end--;
        //     }
        //     return matrix;
        // }
}