interface Electronics
{ void cost();    // Interface consist pure abstract methods , interface by default is abstract and public method.
  void battery();
} 
abstract class Mobile implements Electronics
{ void simslot()
{ System.out.println( "Every mobile has slimslot");
}}
class Iphone extends Mobile
{ public void cost()                      // public keyword is mandatory here beacuse cost and battery methods of interface are public.
{System.out.println( "This mobile is 1000");}
public void battery()                     // Also, methods of the interface must be overridden
{ System.out.println( "This battery is small size");}
}
class Samsung extends Mobile
{ public void cost()                      
{System.out.println( "This mobile is 9000");}
public void battery()
{ System.out.println( "This battery is big  in size");}
}

abstract class Laptop implements Electronics
{ void InbuiltSoftware()
{ System.out.println( "Every laptop has Inbuilt software");
}}
class Dell extends Laptop
{ public void cost()                      // public keyword is mandatory here beacuse cost and battery methods of interface are public.
{System.out.println( "This laptop is 8000");}
public void battery()                     // Also, methods of the interface must be overridden
{ System.out.println( "This battery is inside ");}
}
class Mac extends Laptop
{ public void cost()                      
{System.out.println( "This laptop is 5000");}
public void battery()
{ System.out.println( "This battery has good life time");}

}
class UsingInterface
{ public static void main(String ar[])
{ Mobile x= new Samsung(); // Using upcasting
x.cost();
x.battery();
x.simslot();
x= new Iphone();
x.cost();
x.battery();
x.simslot();
Laptop y= new Dell();
y.cost();
y.battery();
y.InbuiltSoftware();
y= new Mac();
y.cost();
y.battery();
y.InbuiltSoftware();}}
