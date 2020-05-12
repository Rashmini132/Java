class UsingThrow{
public static void main(String ar[])
{ int a=10,b=0;
 System.out.println(a+b);
try{
System.out.println(a/b);
throw new Exception("Using Throw");}
catch( Exception x){ System.out.println(x.toString());
x.printStackTrace();}
System.out.println(a*b);}}
