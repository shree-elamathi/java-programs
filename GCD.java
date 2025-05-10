/*
   ---------GCD------------   
Input: a = 20, b = 28
Output: 4
Explanation: The factors of 20 are 1, 2, 4, 5, 10 and 20. The factors of 28 are 1, 2, 4, 7, 14 and 28. 
Among these factors, 1, 2 and 4 are the common factors of both 20 and 28. 
The greatest among the common factors is 4.


Input: a = 60, b = 36
Output: 12
*/



import java.util.*;
class GCD{
public static void main (String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter  N:");
System.out.print("--->  ");
int n = sc.nextInt(); 
System.out.println("enter  M:");
System.out.print("--->  ");
int m = sc.nextInt(); 
System.out.println("***************************");

int result =Math.min(n,m);
System.out.println(result);
while(result>0){
if(n%result==0 && m%result==0){
break;
} 
result--;

}
System.out.println("GCD OF GIVEN "+n+" and "+m+" is : "+result);
}
}
