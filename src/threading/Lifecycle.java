package threading;

class thread implements Runnable  
	{  
	public void run()  
	{  
	  
	
	try  
	{  
	 
	Thread.sleep(100);  
	}  
	catch (InterruptedException ie)  
	{  
	ie.printStackTrace();  
	}  
	  
	  
	System.out.println("The state of thread t1 while it invoked the method join() on thread t2 -"+ Lifecycle.t1.getState());  
	  
	
	try  
	{  
	Thread.sleep(300);  
	}  
	catch (InterruptedException ie)  
	{  
	ie.printStackTrace();  
	}     
	}  
	}  
	  
	 
	public class Lifecycle implements Runnable  
	{  
	public static Thread t1;  
	public static Lifecycle obj;  
	  
	
	public static void main(String argvs[])  
	{  
	 
	obj = new Lifecycle();  
	t1 = new Thread(obj);  
	  
	  
	System.out.println("The state of thread t1 after spawning it - " + t1.getState());  
	  
	 
	t1.start();  
	  
	
	System.out.println("The state of thread t1 after invoking the method start() on it - " + t1.getState());  
	}  
	  
	public void run()  
	{  
	thread myObj = new thread();  
	Thread t2 = new Thread(myObj);  
	  
	
	System.out.println("The state of thread t2 after spawning it - "+ t2.getState());  
	t2.start();  
	  
	 
	System.out.println("the state of thread t2 after calling the method start() on it - " + t2.getState());  
	  
	
	try  
	{  
	   
	Thread.sleep(200);  
	}  
	catch (InterruptedException ie)  
	{  
	ie.printStackTrace();  
	}  
	  
	System.out.println("The state of thread t2 after invoking the method sleep() on it - "+ t2.getState() );  
	  
	
	try  
	{  
	
	t2.join();  
	}  
	catch (InterruptedException ie)  
	{  
	ie.printStackTrace();  
	}  
	System.out.println("The state of thread t2 when it has completed it's execution - " + t2.getState());  
	}  
	  
	}  
	