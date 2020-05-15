import java.util.*;
class FactoryMethod_iterator
{  public static void main(String ar[])
{ TreeSet<String> s= new TreeSet<String>();
 s.add("a");
s.add("b");
s.add("f");
s.add("d");
s.add("z");
s.add("h");
Iterator e= s.iterator();
while(e.hasNext())
{System.out.println(e.next());} }}