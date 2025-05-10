/*

*****
*   *
*   *
*   *
*****

*/


import java.util.Scanner;
class Square_hollow{
public static void main (String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter  N:");
System.out.print("--->  ");
int n = sc.nextInt(); 
System.out.println("***************************");
System.out.println();

for(int i = 1;i<=n;i++){
if((i==1)||(i==n)){
for(int j = 1;j<=n;j++){
System.out.print("*");
}
}
else{
for(int k = 1; k<=n ; k++){
if((k==1) || (k==n)){
System.out.print("*");
}
else{
System.out.print(" ");
}
}
}
System.out.println();
}



}
}