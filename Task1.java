import java.util.*;
class Task
{
 int EmpNo[]= {1001,1002,1003,1004,1005,1006,1007};
  String EmpName[]= {"Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay"};
  String joinDate[] = {"01/04/2009","23/08/2012","12/11/2008","29/01/2013","16/07/2005","01/01/2000","12/06/2006"};
  char DesignationCode[] = {'e','c','k','r','m','e','c'};
  String Department[] = {"R&D","PM","Acc","Front Desk","Engg","Manufacturing","PM"};
   int Basic[] = {20000,30000,10000,12000,50000,23000,29000};
   int HRA[] = {8000,12000,8000,6000,20000,9000,12000};
   int IT[] = {3000,9000,1000,2000,20000,4400,10000};
   String Designation[] = {"Engineer","Consultant","Clerk","Receptionist","Manager"};
   int DA;
int design(char ch){
switch(ch)
{ 
        case 'e':
	System.out.print("Engineer");
	DA = 20000;
	break;
	case 'c':
	System.out.print("Consultant");
	DA = 32000;
	break;
	case 'k':
	System.out.print("Clerk");
	DA = 12000;
	break;
	case 'r':
	System.out.print("Receptionist");
	DA = 15000;
	break;
	case 'm':
	System.out.print("Manager");
	DA = 40000;
	break;
	}
return DA;
}}
class Task1 { public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.print("Enter employee id: ");
int EmpId = s.nextInt();
Task m= new Task();

for(int i=0;i<7;i++)
{ if (EmpId==m.EmpNo[i])

{int sal= (m.Basic[i]+m.HRA[i]-m.IT[i]);
char a=m.DesignationCode[i];
 


System.out.print("Emp No."+"\t"+"EmpName"+" "+"Department"+"  "+"Designation"+" "+"Salary");
System.out.print("\n"+EmpId);
System.out.print( "   "+m.EmpName[i]);
System.out.print("\t"+"    "+ m.Department[i]+"      ");
int D=m.design(a);
int salary=sal+D; 
System.out.print("\t"+ salary);
}}

 //if(EmpId!=m.EmpNo[i])
//{System.out.print("There is no employee with empid:"+EmpId);}
}}




