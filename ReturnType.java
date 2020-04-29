class A
{  String disp()
  { return "first method";
}
  void disp1()
{  System.out.println("2nd method");
}}
class ReturnType{ 
public static void main(String args[])
{ A X = new A();
 X.disp1();
System.out.println("2nd method"+ X.disp()); // X.disp1() cannot be used here 
}}
  
