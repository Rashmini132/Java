class SleepDemo extends Thread{
public void run(){ for(int i=1;i<=10;i++){
try{ Thread.sleep(3000);
System.out.println(i);}
catch(Exception e){ e.printStackTrace();}}
}
public static void main(String ar[])
{ SleepDemo s=new SleepDemo();
SleepDemo sd= new SleepDemo();
s.start();
sd.start();}}