interface Parent
{ int age =45;
interface Child   
{ int age= 25;      // interface variables are by default public static final
}}
class Details implements Parent, Child
{ void show()
{ System.out.println("age of parent is" + Parent.age);
 System.out.println("age of child is" + Child.age);}
}

class Nested_Interface
{ public static void main(String ar[])
{Details x= new Details();
x.show();
}}
