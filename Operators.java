//The logical && operator doesn't check second condition if first condition is false. 
//The bitwise & operator always checks both conditions whether first condition is true or false.

class Operators {
public static void main(String[] args){
int l = 10;// assignment operator
System.out.println(++l*l++); // 121
short d=10;  
short e=10;  
d=(short)(d+e);//20 which is int now converted to short else complie error ( if d+=e , its implicit and no error in this case also)
System.out.println(d);  

String x = new String("str");
String y = new String("str");

System.out.println(x == y); // prints false
System.out.println(x.equals(y)); // prints true
int a=10;  
int b=5;  
int c=20;  
System.out.println(a<b&&a++<c);//false && true = false  
System.out.println(a);//10 because second condition is not checked  
System.out.println(a<b&a++<c);//false && true = false  
System.out.println(a); }}//11 because second condition is checked 
