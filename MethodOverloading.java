class Numbers{
void SumofNum(int number1){
System.out.println("Num is " +number1);
}
void SumofNum(int number1,int number2)
{System.out.println("Num is " +(number1 +number2));}
void SumofNum(int number1,int number2,int number3)
{System.out.println("Num is " +(number1+number2+number3));}
}
class MethodOverloading
{ public static void main(String args[])
{Numbers X= new Numbers();
X.SumofNum(1);
X.SumofNum(1,2);
X.SumofNum(1,2,3);
}}
