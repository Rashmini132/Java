abstract class life
{ abstract void eatingHabits();// no body ( abstract method)
  abstract void sleepinghabits();
  void breath()
{ System.out.println(" I breathe oxygen");}}
class Animal extends life
{ 
 void eatingHabits()
{ System.out.println(" I eat other animals");}
void sleepinghabits()
{ System.out.println("I sleep 16 hrs");}
}
class Human extends life
{ void eatingHabits()
{System.out.println(" I eat veg");}
void sleepinghabits()
{ System.out.println("I sleep 8 hrs");}
}
class UsingAbstract
{ public static void main(String args[])
{ life x= new Animal();
  x.breath();
  x.eatingHabits();
  x.sleepinghabits();
  x= new Human();
  x.breath();
  x.eatingHabits();
  x.sleepinghabits();}}