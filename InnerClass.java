class School
{ void show()
{ System.out.println(" Exams");}
   class Social
        {  void display(){
System.out.println(" marks");}}}
class InnerClass{
public static void main(String ar[]){

 School x = new School();
 x.show();
School.Social y= x.new Social();
y.display();}}
 