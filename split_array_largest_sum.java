class split_array_largest_sum{
    public static void main(String[] args) {
        int k=2;
        int a[]={10,20,30,40};
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i:a){
            if(i>max){
                max=i;
            }
            sum+=i;
        }
       
        int low=max;
        int high=sum;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(fun(a,mid)<=k){
                high=mid-1;
                ans=mid;
            }
            else{
                
                low=mid+1;

            }
        }
        System.err.println(ans);
    }

    public static int fun(int []a,int k){
        int first=1;
        int sum=0;
        for(int i =0;i<a.length;i++){   
            if(sum+a[i]<=k){
                sum+=a[i];
            }
            else{
                first++;
                sum=a[i];
            }
        }
        return first;
    }
}
