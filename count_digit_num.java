import java.util.Scanner;
class count_digit_num{
public static void main (String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter  N:");
System.out.print("--->  ");
int n = sc.nextInt(); 
System.out.println("***************************");
int count=0;
while(n>0){
count++;
n/=10;
}
System.out.println(count);
}
}
