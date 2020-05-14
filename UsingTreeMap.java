import java.util.*;
class UsingTreeMap
{public static void main(String ar[])
{ TreeMap<Integer,String> s= new TreeMap<Integer,String>();
s.put(6,"Sai");
s.put(2,"Rac");
s.put(3,"mny");
s.put(4,"madhu");
s.put(5,"kav");
s.put(2,"veena");
System.out.println(s);
System.out.println("pollFirstEntry"+s.pollFirstEntry());//Removes and returns a key-value mapping associated with the least key in this map, or null if the map is empty.
System.out.println("pollLastEntry"+s.pollLastEntry());//Removes and returns a key-value mapping associated with the greatest key in this map, or null if the map is empty.
System.out.println(s);
System.out.println("last entry"+s.lastEntry());

System.out.println(" firstEntry"+s.firstEntry());
System.out.println(s.headMap(3));//Returns a view of the portion of this map whose keys are strictly less than toKey.
System.out.println(s.tailMap(3));//Returns a view of the portion of this map whose keys are greater than or equal to fromKey.
System.out.println(s.subMap(2,true,4,true));// s.subMap(2,4)Returns a view of the portion of this map whose keys range from fromKey, inclusive, to toKey, exclusive.

}}
