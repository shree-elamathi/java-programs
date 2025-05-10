import java.util.Scanner;
class Ascii{
public static void main (String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter  a");
char a = sc.next().charAt(0);

if((a>='a' && a<='z')||(a>='A' && a<='Z')){
System.out.println("it is an alphabet");
}
else if(a>='0' && a<='9'){
System.out.println("it is an digit");
}
else{
System.out.println("it is an special character ");
}
}
}