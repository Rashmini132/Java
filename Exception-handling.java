class ExceptionHandling{
public static void main(String ar[])
{ int a=10,b=0;
 System.out.println(a+b);
try{
System.out.println(a/b);}
catch( ArithmeticException x){ System.out.println(x.getMessage());}
System.out.println(a*b);}}

