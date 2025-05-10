
public class row_with_max_1s_in_2d_arr {
    public static void main(String[] args) {
       int matrix[][]={{0,0,0,0},{1,1,1,1},{0,1,1,1}};
        int ans=-1;
        int count_ones=0;
        for(int i=0;i<matrix.length;i++){
            int j=count(matrix[i]);
            if(j>count_ones){
                count_ones=j;
                ans=i;
            }
        }
        System.out.println(ans);

    }

    public static int count(int a[]){
        int low=0;
        int high=a.length-1;
        int index_ones=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]==1){
                index_ones=mid;
                high=mid-1;
            }
            else if(a[mid]==0){
                low=mid+1;
            }

        }
        

        if(index_ones!=-1 && a[index_ones]==1){
        return a.length-index_ones;
        }
        else{
            return 0;
        }
    }
}
