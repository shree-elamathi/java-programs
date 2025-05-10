/*
1
12
123
1234
12345

*/

import java.util.Scanner;
class Number_increasing_pyramid{
public static void main (String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter  N:");
System.out.print("--->  ");
int n = sc.nextInt(); 
System.out.println("***************************");
System.out.println();

for(int i = 1;i<=n;i++){
for(int j = 1;j<=i;j++){
System.out.print(j);
}
System.out.println();
}



}
}