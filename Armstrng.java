class Armstrng
{public static void main(String args[])

{ int n= 153,x1=0,s=0;

for(int i=1;n>0;i++)
{
s=n%10;
x1 = (s*s*s)+x1;
n = n/10;
}  
System.out.println("Sum of cubes of digits is"+x1);}}
