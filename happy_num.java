import java.util.Scanner;
class happy_num{
public static void main (String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter  N:");
System.out.print("--->  ");
int num = sc.nextInt(); 
System.out.println("***************************");
int rem;
int sum =0;
while(num>9){
while(num>0){
rem=num%10;
sum=sum+rem*rem;
num=num/10;
}
num=sum;
sum=0;
}
if((num==1)||(num==7)){
System.out.println("it is happy num");
}

else{
System.out.println("it is sad num");
}
}

}
