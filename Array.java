class Array{
public static void demo ( int [] a ){
for ( int i = a.length-1 ; i>=0 ; i--){
System.out.println( a [i] );
}
}
public static void main ( String [] args ){
int [] a = { 10 , 20 , 30 };
demo( a ) ;
}
}