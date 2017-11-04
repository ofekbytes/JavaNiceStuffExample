package f_Java_Advanced.Threads;

//extends the Thread Class
public class Messages extends Thread 
{
	//override its (Thread) run() method
	public void run( ) 
	{
		System.out.println("strat --> run() test");
	}
	
}
