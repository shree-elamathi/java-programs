import java.util.Scanner;
class Spy_num{
public static void main (String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter  N:");
System.out.print("--->  ");
int n = sc.nextInt(); 
System.out.println("***************************");
int rem;
int num = n;
int temp=n;
int result=1;
int sum=0;
int prd=1;
while(num>0){
rem = num%10;
sum+=rem;
prd*=rem;
num/=10;
}
if(sum==prd){
System.out.print("it is spy ");
}
else{
System.out.print("it is not spy num ");
}


}
}
