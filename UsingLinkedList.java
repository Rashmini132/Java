import java.util.*;
class UsingLinkedList
{ public static void main(String ar[])
{ LinkedList<String> s=new LinkedList<String>();
s.add("c");
s.add(1,"e");
s.addFirst("A");
s.addLast("Z");
s.remove(3);
s.removeFirst();
s.removeLast();
System.out.println(s);
}}