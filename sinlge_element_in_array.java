class single_element_in_array{
    public static void main(String[] args) {
        int a[]={1,1,2,2,3,3,4,5,5,6,6};
        if(a.length==1){
            System.out.println(a[0]);
        }
        if(a.length==0){
            System.out.println(-1);
        }

        if(a[0]!=a[1]){
            System.out.println(a[0]);
        }
        if(a[a.length-1]!=a[a.length-2]){
            System.out.println(a[a.length]);
        }

        int low=1;
        int high=a.length-2;
        while(low<=high){
            int mid=(low+high)/2;


            if((a[mid]!=a[mid+1]) && (a[mid]!=a[mid-1])){
                System.out.print(a[mid]);
            }


            if((mid%2==0 && a[mid]==a[mid+1] )|| (mid%2==1 && a[mid]==a[mid-1])){
                low=mid+1;
            }

            else{
                high=mid-1;
            }
        }
    }
}