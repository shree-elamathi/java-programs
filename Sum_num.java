import java.util.Scanner;
class Sum_num{
public static void main (String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter  Num:");
System.out.print("--->");
int num = sc.nextInt();
int sum =0 ;
int rem;
while ( num>0){
rem = num % 10;
sum = sum+rem;
num = num /10;
}
System.out.println("SUM OF NUM ---->"+sum);
}
}

