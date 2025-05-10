class binary_search{
    public static void main(String[] args) {
        int target=7;
        int []a={1,2,3,4,5,6,7,8,9,10};
        int low = 0;
      int high=  a.length-1;
     
      while(low<=high){
           int mid=(low+high)/2;
        if(a[mid]==target){
            System.out.println(mid);
            break;
        }
        else if(target>a[mid]){
            low=mid+1;
        }
        else if(target<a[mid]){
            high=mid-1;
        }
        else System.out.println(-1);
      }
    }
}