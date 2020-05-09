class School
{ 
static class Social
        {  void display(){
System.out.println(" marks");}
static void content()
{System.out.println(" inside static method"); }}}

class Static_InnerClass{      
public static void main(String ar[]){

 School.Social x= new School.Social();
x.display();
School.Social.content();

}}
 