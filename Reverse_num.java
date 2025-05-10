import java.util.Scanner;
class Reverse_num{
public static void main (String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter  Num:");
System.out.print("--->");
int num = sc.nextInt();
int rev =0 ;
int rem;
while ( num>0){
rem = num % 10;
rev = rev*10+rem;
num = num /10;
}
System.out.println("REVERSE ---->"+rev);
}
}

