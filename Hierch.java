class A
{ void display()
 {System.out.println("Super class");}}
class B extends A
{ void display1()
 {System.out.println("Sub class 1");}}
class C extends A

{ void display2()
 {System.out.println("Sub class 2");}}
class Hierch
{ public static void main(String args[])
{ B x= new B();
  C x1= new C();
x.display();
x1.display();}}