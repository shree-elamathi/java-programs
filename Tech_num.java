/*A tech number is an even-digit number that has the property that when split into two equal halves, the square of the sum of those halves is equal to the original number*/


import java.util.Scanner;
class Tech_num{
public static void main (String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter  N:");
System.out.print("--->  ");
int n = sc.nextInt(); 
System.out.println("***************************");
int sum=0;
int count =0;
int temp=n;
int num=n;
int rem,new1=0,new2=0,i=1;
while(temp>0)
{
count++;
temp/=10;
}
if(count%2==0){
while(i<=count/2){
rem=num%10;
new1=new1*10+rem;
num/=10;
i++;
}
new2=num;
System.out.println(new1+","+new2);

if(n==((new1+new2)*(new1+new2))){
System.out.println("it is a tech number");
}

else{
System.out.println("it is not tech number ");
}

}


else{
System.out.println("it is not even digit number ");
}


}
}