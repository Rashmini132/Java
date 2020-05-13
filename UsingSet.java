import java.util.*;
class UsingSet
{ public static void main(String ar[])
{ TreeSet<String> t =new TreeSet<String>();
t.add("S");
t.add("U");
t.add("P");
t.add("E");
t.add("R");
t.add(" ");
System.out.println(t);
System.out.println(t.first());
System.out.println(t.last());
TreeSet<Integer> x =new TreeSet<Integer>();
x.add(3);
x.add(4);
x.add(5);

System.out.println(x.lower(10));
System.out.println(x.ceiling(5));
System.out.println(x.floor(6));
System.out.println(x.higher(10));
System.out.println(x.pollFirst());
System.out.println(x.pollLast());



}}
