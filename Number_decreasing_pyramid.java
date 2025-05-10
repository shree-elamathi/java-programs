
/*
1234
123
12
1

*/

import java.util.Scanner;
class Number_decreasing_pyramid{
public static void main (String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter  N:");
System.out.print("--->  ");
int n = sc.nextInt(); 
System.out.println("***************************");
System.out.println();

for(int i = 1;i<=n;i++){
for(int j = 1;j<=n-i;j++){
System.out.print(j);
}
System.out.println();
}



}
}