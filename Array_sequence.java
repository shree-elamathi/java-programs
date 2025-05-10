import java.util.Scanner;
class Array_sequence{
public static void main (String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter  N:");
System.out.print("--->");
int n = sc.nextInt();
int [] a = demo(n);
System.out.println("**********THE ELEMENTS OF THE ARRAY*********");
for (int i = 0 ; i<n;i++){
System.out.print(a[i]+",");
}
}


public static int [] demo(int n){
int []a=new int[n];
for(int i=0;i<a.length;i++){
a[i]=(i+1)*(i+1);
}
return a;
}
}
