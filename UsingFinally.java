class UsingFinally{
public static void main(String ar[])
{ int a=10,b=0;
String name = null;
 System.out.println(a+b);
try{
System.out.println(a/b);}
catch( ArithmeticException x){ System.out.println(x.toString());
try{ System.out.println(name.length());
}

catch(NullPointerException y){  // UPCASTING using super class reference to point to subclass object i.e using Exception class object to point to
  //NullpointException

y.printStackTrace();}}
finally { System.out.println("in final ");}


System.out.println(a*b);}}

