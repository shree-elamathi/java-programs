public class search_in_2d_array {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int low=0;
        int high=(a[0].length*a.length )-1;
        int target=6;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            int row=mid/a[0].length;
            int col=mid%a[0].length;
            if(a[row][col]==target){
               System.out.println("true");
               break;
            
            }
            else if(a[row][col]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
    }
}
