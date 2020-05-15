import java.util.*;
class FactoryMethod_Enumeration// Enumeration is legacy cursor(1.1 version) , it supports only Vector.
{  public static void main(String ar[])
{ Vector <String> s= new Vector<String>();
 s.add("a");
s.add("b");
s.add("f");
s.add("d");
s.add("z");
s.add("h");
Enumeration e= s.elements();
while(e.hasMoreElements())
{System.out.println(e.nextElement());} }}