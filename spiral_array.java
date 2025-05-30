

// Problem Statement: Given a Matrix, print the given matrix in spiral order.

// Examples:

// Example 1:
// Input: Matrix[][] = { { 1, 2, 3, 4 },
// 		      { 5, 6, 7, 8 },
// 		      { 9, 10, 11, 12 },
// 	              { 13, 14, 15, 16 } }

// Outhput: 1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10.
// Explanation: The output of matrix in spiral form.



import java.util.ArrayList;

public class spiral_array {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int left =0;
        int right =a[0].length-1;
        int top=0;
        int bottom=a.length-1;
        ArrayList<Integer> list = new ArrayList<Integer>();


        while(top<=bottom && left<=right){


        for(int i=left;i<=right;i++){
            list.add(a[top][i]);
        }
        top++;

        for(int i=top;i<=bottom;i++){
            list.add(a[i][right]);
        }
        right--;

        if(top<=bottom){
        for(int i=right;i>=left;i--){
            list.add(a[bottom][i]);
        }
        bottom--;
    }

if(left<=right){
        for(int i=bottom;i>=top;i--){
            list.add(a[i][left]);
        }
        left++;
    }
}
System.out.println("Spiral Order: " + list);
    }
}
