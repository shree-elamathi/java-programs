/* Write a program to take any character from the user and ceck whether it is alphabet, 
digit or special character. */
import java.util.Scanner;
class CheckChar{
public static void main(String [] args){
Scanner s = new Scanner(System.in);
System.out.println("Enter the character");
char a = s.next().charAt(0);
if (('a'<= a && a<='z') || ('A'<= a && a <='Z')){
System.out.println( a + " is a alphabet");
}
else if ('0'<=a && a<='9'){
System.out.println( a + " is a digit");
}
else{
System.out.println( a + " is a special character");
}
}
}