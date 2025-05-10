//Given the length and breadth of a rectangle, write a program to check whether the perimeter or the area of the rectangle is greater.
import java.util.Scanner;
class Rectangle{
public static void main(String [] args){
Scanner s = new Scanner(System.in);
System.out.println("Enter length: ");
double length = s.nextDouble();
System.out.println("Enter breadth: ");
double breadth = s.nextDouble();
//System.out.println((l*b)>(2*(l+b)?"area":"perimeter");
double area = Area(length,breadth);
double perimeter = Perimeter(length,breadth);
if (area>perimeter){
System.out.println("Area is Greater");
}
else{
System.out.println("Perimeter is Greater");
}
}
public static double Area(double l, double b){
return l*b;
}
public static double Perimeter(double l, double b){
return (2*(l+b));

}
}