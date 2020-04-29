class A
{  String disp(){
System.out.println(" 1st Method ");
return "first method";
}
  void disp1()
{  System.out.println("2nd method");
}}
class Display{ 
public static void main(String args[])
{ A X = new A();
 X.disp1();
System.out.println("2nd method "+ X.disp()); // X.disp1() cannot be used here 
}}
  
