//Write a program to check whether a number is negative, positive or zero.
import java.util.Scanner;
class PosNegZero{
public static void main(String [] args){
Scanner s = new Scanner(System.in);
System.out.println("Enter the number:");
int a = s.nextInt();
if (a>0)
System.out.println(a + " is positive");
else if(a==0)
System.out.println(a + " is zero");
else
System.out.println(a + " is negative");
}
}