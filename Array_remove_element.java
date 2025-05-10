import java.util.Arrays;
import java.util.Scanner;
class Array_remove_element{
    public static int[] remove(int[] arr, int in) {

        if (arr == null || in < 0 || in >= arr.length) {
            return arr;
        }

          int[] arr2 = new int[arr.length - 1];

        // Copy the elements except the index
        // from original array to the other array
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == in)
                continue;
            
              arr2[k++] = arr[i];
        }

        return arr2;
    }
  
    public static void main(String[] args)
    {
        int[] arr = { 1, 2, 3, 4, 5 };
	Scanner s = new Scanner(System.in);
System.out.println("Enter the index to be removed:");
          int in = s.nextInt();

        // Remove the element
        arr = remove(arr, in);

        System.out.println(Arrays.toString(arr));
    }
}