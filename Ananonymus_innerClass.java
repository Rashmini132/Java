abstract class Car
{ abstract void show();}

class Ananonymus_innerClass
{ public static void main(String ar[])
 { Car x=new Car()
  { void show()
{ System.out.println("Anony");} };
x.show();
  }}



