/*

1
2 3
4 5 6
7 8 9 10

*/



import java.util.Scanner;
class Number_changing_pyramid{
public static void main (String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter  N:");
System.out.print("--->  ");
int n = sc.nextInt(); 
System.out.println("***************************");
System.out.println();
int count=0;
for(int i = 1;i<=n;i++){
for(int j = 1;j<=i;j++){
if(true){
++count;
System.out.print(count +" ");
}
}
System.out.println();
}



}
}