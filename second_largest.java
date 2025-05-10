
public class second_largest {
      public static void main(String[] args) {
        int a [] = {13,46,24,52,20,9};
        int n = a.length;
        int lar=a[0];
        int sec=a[0];
        for (int i =0 ; i<=n-2;i++){
            if(a[i]>lar){
                sec=lar;
                lar=a[i];
            }
            else if (a[i]>sec && a[i]<lar){
                sec =a[i];
            }
        }
        System.err.println(lar+","+sec);
    }
}
