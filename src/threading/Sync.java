package threading;
class Sync1  
{      
 void printTable(int n)
 {    
   synchronized(this)
   
   
   {   
     for(int i=1;i<=5;i++)
     {    
      System.out.println(n*i);    
      try{    
       Thread.sleep(400);    
      }catch(Exception e)
      {System.out.println(e);
      }    
     }    
   }    
 } 
}    
    
class MyThread1 extends Thread
{    
Sync1 t;    
MyThread1(Sync1 t)
{    
this.t=t;    
}    
public void run()
{    
t.printTable(5);    
}    
    
}    
class MyThread2 extends Thread
{    
Sync1 t;    
MyThread2(Sync1 t)
{    
this.t=t;    
}    
public void run()
{    
t.printTable(100);    
}    
}    
    
public class Sync
{    
public static void main(String args[]){    
Sync1 obj = new Sync1();   
MyThread1 t1=new MyThread1(obj);    
MyThread2 t2=new MyThread2(obj);    
t1.start();    
t2.start();    
}    
}    
