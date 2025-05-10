import java.util.Scanner;
class Calculator{
public static void main (String[]args){
Scanner s = new Scanner(System.in);
System.out.println("***Enter the a***");
System.out.print("-->");
double a = s.nextDouble();
System.out.println("***Enter the b***");
System.out.print("-->");
double b = s.nextDouble();
System.out.println("------1-add , 2-sub , 3-mul , 4-div-------");
System.out.print("-->");
int c = s.nextInt();


if ((a!=0) && (b!=0)){
switch(c){

case 1:{
System.out.println(a+" + "+b+" = "+(a+b));
break;
}

case 2:{
System.out.println(a+" - "+b+" = "+(a-b));
break;
}

case 3:{
System.out.println(a+" * "+b+" = "+(a*b));
break;
}

case 4:{
System.out.println(a+" / "+b+" = "+(a/b));
break;
}

}
}


else{
System.out.println("***THE INPUT SHOULD NOT BE ZERO***");
}




}


}