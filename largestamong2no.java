import java.util.Scanner;
class largestamong2no{

public static void main (String[] args){

Scanner s = new Scanner(System.in);
System.out.println("Enter A:");
int a = s.nextInt();
System.out.println("Enter B:");
int b = s.nextInt();
if(a>b)
System.out.println("A is LARGEST");
else
System.out.println("B is LARGEST");
}
}