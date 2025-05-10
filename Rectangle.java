import java.util.Scanner;
class Rectangle{
public static void main (String[]args){
Scanner s = new Scanner(System.in);
System.out.println("***Enter the lenght ***");
System.out.print("--> ");
double a = s.nextDouble();
System.out.println("***Enter the breadth ***");
System.out.print("--> ");
double b = s.nextDouble();


if ((a!=0) && (b!=0)){


double area = a*b;
double perimeter = 2*(a+b);
System.out.println(" THE AREA OF THE RECATANGEL IS = "+ area);
System.out.println(" THE PERIMETER OF THE RECATANGEL IS = "+ perimeter);

if(area>perimeter){
System.out.println(" ***THE AREA OF THE RECATANGEL IS GREATER***");
}

else{
System.out.println("***THE PERIMETER IS GREATER***");
}
}



else{
System.out.println("***THE INPUT SHOULD NOT BE ZERO***");
}


}
}