
import java.util.Scanner;
class Power_of_num{
public static void main (String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter  N:");
System.out.print("--->  ");
int n = sc.nextInt(); 
System.out.println("***************************");
System.out.println();

int num=n;
 int rev=0;
        int rem;
        int ans =n,op=1;
        while(num>0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println(rev);


        for(int i=1;i<=rev;i++)
        {
            op*=ans;

        }
        System.out.println(op);


}

}




