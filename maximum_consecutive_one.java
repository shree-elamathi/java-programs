

//Problem Statement: Given an array that contains only 1 and 0 return the count of maximum consecutive ones in the array.


class maximum_consecutive_one{
    public static void main(String[] args) {
        int a[]={1,1,0,1,1,1,0,1,1,1,1};
        int count=0;
        int max=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==1){
                count++;
                if(count>max){
                    max=count;
                }
            }
            else if(a[i]==0){
                count=0;
            }
        }
        System.out.println(max);
    }
}