//Write a program to find maximum between three numbers
class Maximum{
public static void main(String [] args){
int a,b,c;
a=40;
b=20;
c=50;
if (a>b && a>c){
System.out.println(a + " is greater");
}
else if (b>c){
System.out.println(b + " is greater");
}
else{
System.out.println(c + " is greater");
}
}
}