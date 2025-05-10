
import java.util.Arrays;



// Examples 1:
// Input:
//  matrix=[[1,1,1],[1,0,1],[1,1,1]]

// Output:
//  [[1,0,1],[0,0,0],[1,0,1]]

// Explanation:
//  Since matrix[2][2]=0.Therfore the 2nd column and 2nd row wil be set to 0.
public class matrix_set_zeros {


    //brute force solution 



    // public static void main(String[] args) {
    //     int a[][]={{1,1,1},{1,0,1},{1,1,1,}};

    //     for(int i =0;i<a.length;i++){
    //         for(int j=0;j<a[i].length;j++){
    //             if(a[i][j]==0){
    //                 mark_row(a,i);
    //                 mark_col(a,j);
    //             }
    //         }
    //     }

    //     for(int i =0;i<a.length;i++){
    //         for(int j=0;j<a[i].length;j++){
    //             if(a[i][j]==-1){
    //                 a[i][j]=0;
    //             }
    //         }
    //     }

    //     System.out.println(Arrays.deepToString(a));


    // }

    // public static void mark_row(int [][]a,int i ){
    //     for(int j=0;j<a[i].length;j++){
    //         a[i][j]=-1;
    //     }
    // }

    // public static void mark_col(int [][]a,int j ){
    //     for(int i=0;i<a[j].length;i++){
    //         a[i][j]=-1;
    //     }
    // }



    //better solution 

    // it is done by creating a two array as row and column initial value is 0 and if any cell in 2d array has zero then 
    // we make the respected row -i value as 1 and respected column -j value as 1 
    // then we iterate through the 2d array again if the row[i] or column[j]==1 then the entire a[i][j]=0

    // public static void main(String[] args) {
    //     int a[][]={{1,1,1},{1,0,1},{1,1,1,}};
    //     int row[]=new int [a.length];
    //     int column[]=new int [a[0].length];
    //     for(int i=0;i<a.length;i++){
    //         for(int j=0;j<a[0].length;j++){
    //             if(a[i][j]==0){
    //                 row[i]=1;
    //                 column[j]=1;
    //             }
    //         }
    //     }


    //     for(int i=0;i<a.length;i++){
    //         for(int j=0;j<a[0].length;j++){
    //             if(row[i]==1||column[j]==1){
    //                 a[i][j]=0;
    //             }
    //         }
    //     }

    //     System.out.println(Arrays.deepToString(a));

        

    // }





    //optimal solution 

    // public static void main(String[] args) {
    //     int a[][]={{1,1,1},{1,0,1},{1,1,1,}};
    //     int col0=1;
    //     for(int i =0;i<a.length;i++){
    //         for(int j=0;j<a[0].length;j++){
    //             if(a[i][j]==0){

    //                 //mark the ith row as 0
    //                 a[i][0]=0;

    //                 if(j!=0){
    //                     //mark the jth column as 0
    //                     a[0][j]=0;
    //                 }

    //                 else{
    //                     //if j =0 then mark column col0 as 0
    //                     col0=0;
    //                 }
                    
    //             }
    //         }
    //     }

    //     for(int i =1;i<a.length;i++){
    //         for(int j=1;j<a[0].length;j++){
    //             if(a[i][j]!=0){
    //                 if(a[0][j]==0||a[i][0]==0){
    //                     a[i][j]=0;
    //                 }
    //             }
    //         }
    //     }
    //     if(a[0][0]==0){
    //         for(int j =0;j<a[0].length;j++){
    //             a[0][j]=0;
    //         }
    //     }

    //     else if(col0==0){
    //         for(int i =0;i<a.length;i++){
    //             a[i][0]=0;
    //         }
    //     }
    //     System.out.println(Arrays.deepToString(a));

    // }





    //leetcode simple and easy solution 

    public static void main(String[] args) {
            int matrix[][]={{1,1,1},{1,0,1},{1,1,1,}};
              final int m = matrix.length;
              final int n = matrix[0].length;
              boolean shouldFillFirstRow = false;
              boolean shouldFillFirstCol = false;
          
              for (int j = 0; j < n; ++j)
                if (matrix[0][j] == 0) {
                  shouldFillFirstRow = true;
                  break;
                }
          
              for (int i = 0; i < m; ++i)
                if (matrix[i][0] == 0) {
                  shouldFillFirstCol = true;
                  break;
                }
          
              // Store the information in the first row and the first column.
              for (int i = 1; i < m; ++i)
                for (int j = 1; j < n; ++j)
                  if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                  }
          
              // Fill 0s for the matrix except the first row and the first column.
              for (int i = 1; i < m; ++i)
                for (int j = 1; j < n; ++j)
                  if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
          
              // Fill 0s for the first row if needed.
              if (shouldFillFirstRow)
                for (int j = 0; j < n; ++j)
                  matrix[0][j] = 0;
          
              // Fill 0s for the first column if needed.
              if (shouldFillFirstCol)
                for (int i = 0; i < m; ++i)
                  matrix[i][0] = 0;

            System.out.println(Arrays.deepToString(matrix));
            }
          
    }

