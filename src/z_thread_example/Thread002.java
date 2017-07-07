
package z_thread_example;

public class Thread002 extends Thread {


	public String PuStName;
	
	//thread - give the thread a name/label
	public Thread002(String StName) {		
		PuStName = StName;
	}


	
	public void run(){		
		for (int i = 0; i < 10; i++)
		{
			System.out.println(PuStName + " ==> " + i);
		}	
	}
	
	
	public static void main(String [] args)
	{
		Thread002 td1 = new Thread002("Thread_1");
		Thread002 td2 = new Thread002("Thread_2");
		
		
		td1.start();
		td2.start();		

	}
}
