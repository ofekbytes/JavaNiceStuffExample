package f_Java_Advanced.Threads;

import z_example.old.hd.msg;

public class ThreadMain 
{

	public static void main(String[] args) 	
	{
		//priority default = 5
		Messages msg = new Messages();	
		System.out.println(msg);
		msg.start();		


		//priority default = 7
		Messages msg2 = new Messages();
		msg2.setPriority(7);
		System.out.println(msg2);
		msg2.start();


		//thread Runnable
		Thread t = new Thread(new Messages());
		t.start();
		
//		try 
//		{
//			t.sleep(1000);
//		} 
//		catch (InterruptedException e) 
//		{
//			e.printStackTrace();
//		}
		
	}

}
