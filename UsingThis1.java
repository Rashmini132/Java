class A
{ 
  A(int a,float b)
{ this(2);
System.out.println(" value of x is " + a);
System.out.println(" value of y is " + b);
  }
  A(int c)
{ System.out.println(" value of z is " + c);
  }}
class UsingThis1{
public static void main(String args[])
{ A onj=new A(23,23.5f);
  
  }}