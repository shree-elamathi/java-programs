import java.util.Scanner;
class Fibonaci_series_with_array{
public static void main (String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter  N:");
System.out.print("--->");
int n = sc.nextInt();
int [] a = demo(n);
System.out.println("*********FIBONACI SERIES*********");
for (int i = 0 ; i<n;i++){
System.out.print(a[i]+",");
}
}



public static int [] demo(int n){
int []a=new int[n];
a[0]=0;
a[1]=1;
for(int i=2;i<a.length;i++){
a[i]=a[i-1]+a[i-2];
}
return a;
}

}
