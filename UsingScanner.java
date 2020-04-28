import java.util.Scanner;

class Numbers{
void DisplayofNum(int number1)
{System.out.println("Num is " +number1);}
void DisplayofNum(int number1,int number2)
{System.out.println("Num are " +number1 +number2);}
void DisplayofNum(int number1,int number2,int number3)
{System.out.println("Num are " +number1+number2+number3);}
}
class UsingScanner
{ public static void main(String args[])
{Numbers X= new Numbers();
Scanner Y=new Scanner(System.in);
System.out.println("Enter the first Number");
int a=Y.nextInt();
X.DisplayofNum(a);
System.out.println("Enter the second setNumber");
int b=Y.nextInt();
X.DisplayofNum(a,b);
System.out.println("Enter the third set Number");

int c=Y.nextInt();


X.DisplayofNum(a,b,c);
}}
