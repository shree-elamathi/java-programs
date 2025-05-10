
import java.util.Arrays;



class merge_2_arrays{
    public static void main(String[] args) {
        int a[]={1,2,3,0,0,0};
        int b[]={2,5,6};
        int m =3;
        int n=3;
        for(int i =m;i<a.length;i++){
            a[i]=b[i-m];
        }

        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1]){
                int temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
                i=-1;
            }
        }
        System.out.println(Arrays.toString(a));
        
    }
}


//optimal solution in leet code


// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//        for(int i=0; i<n; i++){
//          nums1[i+m]=nums2[i];
//        }
//        Arrays.sort(nums1);
//        return;
//     }
// }