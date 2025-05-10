/*create a simple calculator that takes two integers ans an operator(+,-,*,/) as input. Write a program to perform the operation and print the result. 
Handle division by zero appropriately.
*/
import java.util.Scanner;
class Calculator1{
public static void main(String [] args){
Scanner s = new Scanner(System.in);
System.out.println("Enter the first Number: ");
double a = s.nextDouble();
System.out.println("Enter the Second Number: ");
double b = s.nextDouble();
System.out.println("Choose the operator to perform: ");
System.out.println("1. +");
System.out.println("2. -");
System.out.println("3. *");
System.out.println("4. /");
int x = s.nextInt();
//You can also directly use operands as character in switch
switch(x){
case 1:
System.out.println(a + " + " + b + " = " + (a+b));
break;
case 2:
System.out.println(a + " - " + b + " = " + (a-b));
break;
case 3:
System.out.println(a + " * " + b + " = " + (a*b));
break;
case 4:
{
if (a==0.00 || b==0.00){
System.out.println("Division by zero is not possible");
}
else{
System.out.println(a + " / " + b + " = " + (a/b));
break;
}
}
default:
System.out.println("Invalid Input");
}
}
}