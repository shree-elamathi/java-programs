public class check_sorted {
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5};
        int n = a.length;
        int lar=a[0];
        int sec=a[0];
        int flag=0;
        for (int i =0 ; i<=n-2;i++){
            if(a[i]<=a[i+1]){
                flag =0;
            }
            else{
                flag =1;
            }
        }
        if(flag ==1){
            System.out.print("not sorted");
        }
        else{
            System.err.println("sorted");
        }
    }
}
