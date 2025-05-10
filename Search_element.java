
import java.util.Scanner;
class Search_element{
public static void main (String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter  SIZE:");
System.out.print("--->  ");
int n = sc.nextInt(); 
System.out.println("***************************");
System.out.println();
int [] a = new int[n];

for(int i=0;i<n;i++){
System.out.println("ENTER "+i+" ELEMENT :");
a[i]=sc.nextInt();
}

System.out.println("***************************");
System.out.println();
System.out.println("enter  element to find:");
System.out.print("--->  ");
int op = sc.nextInt(); 





for(int i : a){

if(op==i){
System.out.println("MAXIMUM ELEMENT FOUND");

}
}

}

}




