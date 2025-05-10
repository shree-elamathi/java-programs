import java.util.Scanner;
class Comparison{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
int a= s.nextInt();
int b= s.nextInt();
int c= s.nextInt();
int ac= count(a);
int bc= count(b);
int cc= count(c);
if ((ac>bc) && (ac>cc))
System.out.println(a);
else if ((bc>ac) && (bc>cc))
System.out.println(b);
if ((cc>ac) && (cc>bc))
System.out.println(c);
}
public static int count(int a){
int count=0;
while(a>0){
count++;
a/=10;
}
return count;
}
}
