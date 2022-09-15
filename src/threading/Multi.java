package threading;
class Thread1 extends Thread
{
      private Thread thread;
      private String threadName;

      Thread1( String msg)
      {
             threadName = msg;
             System.out.println("Creating thread: " +  threadName );
      }
      public void run()
      {
             System.out.println("Running thread: " +  threadName );
             try
             {
                   for(int i = 0; i < 5; i++)
                   {
                         System.out.println("Thread: " + threadName + ", " + i);
                         Thread.sleep(50);
                   }
             }
             catch (InterruptedException e)
             {
                   System.out.println("Exception in thread: " +  threadName);
             }
             System.out.println("Thread " +  threadName + " continue...");
      }   
      public void start ()
      {
            System.out.println("Start method " +  threadName );
            if (thread == null)
            {
                  thread = new Thread (this, threadName);
                  thread.start ();
            }
      }
}
public class Multi
{
      public static void main(String args[])
      {
            Thread1 thread1 = new Thread1("first thread");
            thread1.start();
      
            Thread1 thread2 = new Thread1("second thread");
            thread2.start();
      }   
}