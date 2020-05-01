class A
{ int a;
  float b; // instance var
  A (int a,float b)// this is used when local and instance var are same
{ this.a= a; 
  this.b= b;// This points to curent object
}  
void show()
{ System.out.println(" value of x is " + a);
System.out.println(" value of y is " + b);
  }}
class UsingThis{
public static void main(String args[])
{ A onj=new A(23,23.5f);
  onj.show(); 
  A onj1=new A(25,50.5f);
onj1.show();}}