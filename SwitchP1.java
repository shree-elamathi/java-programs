import java.util.Scanner;
class SwitchP1{
public static void main(String [] args){
Scanner s = new Scanner(System.in);
System.out.println("Enter a number: ");
int num = s.nextInt();
switch ( num % 2 ){
case 0:
System.out.println ( num + " is even");
break;
case 1:
System.out.println ( num + " is odd");
}
}
}