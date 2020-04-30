class A
{ int a;
  float b; // instance var
  A (int x,float y)
{ a= x; // x and y are local variables and are declared inside the method.
  b= y;// They are not known outside this block. 
}  
void show()
{ System.out.println(" value of x is " + a);
System.out.println(" value of y is " + b);
  }}
class Const{
public static void main(String args[])
{ A onj=new A(23,23.5f);
  onj.show(); }}