package z_thread_example;


public class Thread004 extends Thread {


	public String PuStName;
	
	
	public Thread004(String StName) {		
		PuStName = StName;
	}


	
	public void run(){		
		for (int i = 0; i < 10; i++)
		{
			System.out.println(PuStName + " ==> " + i);
			try {
				sleep (10);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}	
	}
	
	public static void main(String [] args)
	{
		Thread004 td1 = new Thread004("Thread_1");
		Thread004 td2 = new Thread004("Thread_2");
		
		
		td1.start();
		td2.start();		

	}
}

