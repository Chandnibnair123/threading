package threading;


	public class Priority extends Thread
	{
	    public void run ()
	    {
	        System.out.println ("running thread name is:" + Thread.currentThread ().getName ());
	        System.out.println ("running thread priority is:" + Thread.currentThread ().getPriority ());
	    }
	    public static void main (String args[])
	    {
	        Priority n1 = new Priority ();
	        Priority n2 = new Priority ();
	        n1.setPriority (Thread.MIN_PRIORITY);
	        n2.setPriority (Thread.MAX_PRIORITY);
	        n1.start ();
	        n2.start ();
	    }
	}


	