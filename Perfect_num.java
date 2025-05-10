/*  A perfect number is a positive integer that is equal to the sum of its positive proper divisors, or divisors excluding the number itself
*/



import java.util.Scanner;
class Perfect_num{
public static void main (String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter  N:");
System.out.print("--->  ");
int n = sc.nextInt(); 
System.out.println("***************************");
int sum=0;
for(int i=1;i<n;i++){
if(n % i==0){
sum+=i;
}
}
System.out.println(sum);
if(sum==n){
System.out.println("it is perfect number ");
}
else{
System.out.println("it is not Perfect number ");
}


}
}
