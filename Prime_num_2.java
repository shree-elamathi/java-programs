import java.util.Scanner;
class Prime_num_2{
public static void main (String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter  N:");
System.out.print("--->");
int n = sc.nextInt();
int prime = 0;
for(int i=2;i<n;i++)
{
if(n%i==0){
System.out.println("IT IS NOT A PRIME NUM");
prime=1 ;
}
}
if(prime==0){
System.out.println("IT IS PRIME NUM");
}
}
}

