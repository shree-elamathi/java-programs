import java.util.Scanner;
class Prime_num{
public static void main (String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter  N:");
System.out.print("--->");
int n = sc.nextInt();
int count=0;
for(int i=1;i<=n;i++){
if(n%i==0){
count++;
}
}
if(count==2){
System.out.println("IT IS PRIME NUM");
}
else{
System.out.println("IT IS NOT A PRIME NUM");
}
}
}

