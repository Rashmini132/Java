class Subject
{ int a; // instance variable and static are declared outside the method
  static int b;// and not mandatory to initialize them
}
class Variables
{ public static void main(String args[])
  { Subject X= new Subject();
  X.a= 100;
  Subject.b= 200;
 System.out.println("values of a and b are "+ X.a + " and " + Subject.b);}}
