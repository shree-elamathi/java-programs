import java.util.Scanner;
class Factorial{
public static void main (String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter  N:");
System.out.print("--->  ");
int num = sc.nextInt(); 
System.out.println("***************************");

int fact=1;
int i=1;
while(i<=num){
fact*=i;
i++;
}
System.out.println("Factorial is "+fact);
}}