import java.util.Scanner;
class zero_one_traingle{
public static void main (String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter  N:");
System.out.print("--->  ");
int n = sc.nextInt(); 
System.out.println("***************************");
System.out.println();
int count=0;
for(int i = 1;i<=n;i++){
if(i%2==0){
for(int j = 0;j<=i;j++){
System.out.print( j+" ");
}
}
else{
for(int k = 1;k<=i;k++){
System.out.print(k+" ");
}
}

System.out.println();
}



}
}