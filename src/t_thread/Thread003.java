package t_thread;

public class Thread003 extends Thread {

	//private static int intCount = 0;
	public String PuStName;
	
	
	public Thread003(String StName) {		
		PuStName = StName;
	}


	
	public void run(){
		//intCount++; 
		//System.out.println("intCount = " + intCount);
		for (int i = 0; i < 100; i++)
		{
			System.out.println(PuStName + " ==> " + i);
		}	
	}

	
	public String getPuStName() {
		return PuStName;
	}

	public void setPuStName(String puStName) {
		PuStName = puStName;
	}
	
	public static void main(String [] args)
	{
		Thread003 td1 = new Thread003("Thread_1");
		Thread003 td2 = new Thread003("Thread_2");
		Thread003 td3 = new Thread003("Thread_3");
		
		
		td1.start();
		td2.start();		
		td3.start();				
	}
}
