import java.util.Scanner;
class Switch{
public static void main(String[]args){

Scanner s = new Scanner(System.in);
System.out.println("ENter the number ");
int a = s.nextInt();
switch(a%2){
case 0: {
System.out.println("it is even");
break;
}
case 1: System.out.println("it is odd");


}
}
}