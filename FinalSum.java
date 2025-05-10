import java.util.Scanner;
class FinalSum{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
int num = s.nextInt();
sum(num);
}
public static void sum(int a){
int rem;
int sum=0;
while(a>0){
rem= a%10;
sum+=rem;
a/=10;
}
if(sum>=0 && sum<=9)
System.out.println(sum);
else
sum(sum);
}
}