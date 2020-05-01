class A
{ int a=4;
  }
class B extends A
{ int a=2; 
void show()
{ System.out.println(" a value in child is" + a);
  System.out.println(" a value in Parent is" + super.a);
}}
class UsingSuper{
public static void main(String args[])
{ B x=new B();
x.show();
 }}
// whenever child object is created, memory is allocated to parent also. 
//In order to use that memory, we use super keyword. 
//super is used to point to this memory allocation i.e created while creating object of child.