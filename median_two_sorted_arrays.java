class median_two_sorted_arrays{
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={2,3,4,5,6};
        // int c[]=new int[a.length+b.length];
        // for(int i =0;i<a.length;i++){
        //     c[i]=a[i];
        // }
        // for(int i=a.length;i<a.length+b.length;i++){
        //     c[i]=b[i-a.length];
        // }
        // int median=c[c.length/2];
        // System.err.println(median);
        int n=a.length+b.length;
        int m=n/2;
        int n1=m-1,n2=m;
        int el1=-1,el2=-1;
        int count=0;
        int i=0;
        int j=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                if(count==n1){
                    el1=a[i];
                }

                if(count==n2){
                    el2=a[i];
                }
                i++;
                count++;
            }
            else if(a[i]>=b[j]){
                
                if(count==n1){
                    el1=b[j];
                }

                if(count==n2){
                    el2=b[j];
                }
                j++;
                count++;
            }
            
        }

        while(i<a.length){
            if(count==n1){
                el1=a[i];
            }

            if(count==n2){
                el2=a[i];
            }
            i++;
            count++;
        }

        while(j<b.length){
            if(count==n1){
                el1=b[j];
            }

            if(count==n2){
                el2=b[j];
            }
            j++;
            count++;
        }
        if(n%2==0){
            double ans=(el1+el2)/2.0;
            System.out.println(ans);
        }
        else{
            System.err.println(el2);
        }

    }
}