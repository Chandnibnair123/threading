package threading;
import java.io.*;

class Thread4 extends Thread {
    
    public void run()
    {
        System.out.println("Overridden Run Method");
    }
}
 
public class Runningthread {
 
    public static void main(String[] args)
    {
        Runningthread t1 = new Runningthread();
        Runningthread t2 = new Runningthread();
        t1.start(); 
        t2.start();
 
        
        ThreadGroup threadGroup
            = Thread.currentThread().getThreadGroup();
 
        
        int threadCount = threadGroup.activeCount();
 
        Thread threadList[] = new Thread[threadCount];
        
        threadGroup.enumerate(threadList);
 
        System.out.println("Active threads are:");
       
        
        for (int i = 0; i < threadCount; i++)
            System.out.println(threadList[i].getName());
    }

	private void start() {
		// TODO Auto-generated method stub
		
	}
}


	