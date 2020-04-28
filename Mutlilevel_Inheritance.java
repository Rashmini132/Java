class A
{ void display()
{ System.out.println("I am super class");}}
class B extends A
{ void display1()
{System.out.println("Iam sub class 1");}}
class C extends B
{ void display2()
{ System.out.println("Iam sub class 2");}}
class Mutlilevel_Inheritance
{ public static void main(String args[]){
C x= new C();

x.display();
x.display1();
x.display2();}}