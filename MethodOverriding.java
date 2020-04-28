class A
{ void display()
{ System.out.println("I am super class");}}
class B extends A
{ void display()
{System.out.println("Iam sub class 1");}}
class C extends A
{ void display()
{ System.out.println("Iam sub class 2");}}

class MethodOverriding // UP CASTING

{ public static void main(String args[]){

A x=new B();
x.display();
x=new C();
x.display();}}