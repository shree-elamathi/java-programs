
import java.util.Scanner;
class reverse_center_triangle{
public static void main (String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter  N:");
System.out.print("--->  ");
int n = sc.nextInt(); 
System.out.println("***************************");
System.out.println();


for(int i = 1 ; i<=n;i++){

for(int k=1 ; k<i ; k++){
System.out.print(" ");
}

for(int j=i ; j<=n ; j++){
System.out.print("* ");
}

System.out.println();
}

}

}
