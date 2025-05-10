import java.util.Scanner;
class Fibonaci_series{
public static void main (String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter  N:");
System.out.print("--->");
int n = sc.nextInt(); 
System.out.println("*********FIBONACI SERIES*********");
fibonaci(n);
}


public static void fibonaci(int n){
int n1 = 0;
int n2 = 1;
int n3;
System.out.print(n1+" "+n2+" ");
for (int i=1;i<=n;i++){
n3= n1+n2;
System.out.print(+n3+" ");
n1=n2;
n2=n3;

}
}
}
