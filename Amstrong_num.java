import java.util.Scanner;
class Amstrong_num{
public static void main (String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter  N:");
System.out.print("--->  ");
int n = sc.nextInt(); 
System.out.println("***************************");
int rem;
int num = n;
int temp=n;
int check=n;
int count = 0;
int result=1;
int sum=0;


while(num>0){
count++;
num /=10;
}
while(temp>0){
rem = temp%10;
result=1;
for(int i = 1 ; i<=count;i++){
result*=rem;


}
sum+=result;
temp/=10;
}
if(sum==check){
System.out.print("it is amstrong ");
}
else{
System.out.print("it is not amstrong ");
}


}
}
