
import java.util.Scanner;
class Min_Max_Array{
public static void main (String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter  SIZE:");
System.out.print("--->  ");
int n = sc.nextInt(); 
System.out.println("***************************");
System.out.println();
int [] a = new int[n];
int min=a[0];
int max=a[0];
for(int i=0;i<n;i++){
System.out.println("ENTER "+i+" ELEMENT :");
a[i]=sc.nextInt();
}

for(int i : a){
if(min>i){
min=i;
}
}
System.out.println("MINIMUM ELEMENT :"+ min);


for(int i : a){

if(max<i){
max=i;
}
}
System.out.println("MAXIMUM ELEMENT :"+ max);


}

}




