import java.util.Scanner;
class even_or_odd{
public static void main (String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter  N:");
System.out.print("--->  ");
int n = sc.nextInt(); 
System.out.println("***************************");

if (n%2==0){
System.out.println("it is even");
}

else{
System.out.println("It is odd");
}
}
}
