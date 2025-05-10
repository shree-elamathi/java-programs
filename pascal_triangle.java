
import java.util.ArrayList;
import java.util.List;

// Program to generate Pascal's Triangle



// Problem Statement: This problem has 3 variations. They are stated below:

// Variation 1: Given row number r and column number c. Print the element at position (r, c) in Pascal’s triangle.

// Variation 2: Given the row number n. Print the n-th row of Pascal’s triangle.

// Variation 3: Given the number of rows n. Print the first n rows of Pascal’s triangle.

// In Pascal’s triangle, each number is the sum of the two numbers directly above it as shown in the figure below:


// Example 1:
// Input Format:
//  N = 5, r = 5, c = 3

// Result:

//  6 (for variation 1)

// 1 4 6 4 1 (for variation 2)

// 1 
// 1 1 
// 1 2 1 
// 1 3 3 1 
// 1 4 6 4 1    (for variation 3)

// Explanation:
//  There are 5 rows in the output matrix. Each row is formed using the logic of Pascal’s triangle.

public class pascal_triangle {


    // Variation 1: Given row number r and column number c. Print the element at position (r, c) in Pascal’s triangle.
    //r-1!/c-1!*((r-1) - (c-1))!
    
    // public static void main(String[] args) {
    //     int r=5;
    //     int c=3;
    //     int ans=pas(r,c);
    //     System.out.println(ans);
    // }

    // public static int pas(int r,int c){
    //     int ans=fact(r-1)/(fact(c-1)*fact((r-1)-(c-1)));
    //     return ans;
    // }

    // public static int fact(int n ){
    //     int prd=1;
    //     for(int i =1;i<=n;i++){
    //         prd=prd*i;
    //     }
    //     return prd;
    // }




    // Variation 2: Given the row number n. Print the n-th row of Pascal’s triangle.
// public static void main(String[] args) {
//     int n=5;
//     int ans=1;
//     System.out.print(ans);
//     for(int i=1;i<n;i++){
//         ans=ans*(n-i);
//         ans=ans/i;
//         System.out.print(ans);
//     }
// }





    // Variation 3: Given the number of rows n. Print the first n rows of Pascal’s triangle.

   public static void main(String[] args) {
    int numRows=5;
    List<List<Integer>> ans = new ArrayList<>();
    for(int i =1;i<=numRows;i++){
        ans.add(fun(i));
    }
    System.out.println(ans);
   }

    public static List<Integer> fun(int n){
        List<Integer> temp = new ArrayList<>();
        int ans=1;
        temp.add(ans);
        for(int i=1;i<n;i++){
            ans=ans*(n-i);
            ans=ans/i;
            temp.add(ans);
        }
        return temp;
    }

    
    
}
