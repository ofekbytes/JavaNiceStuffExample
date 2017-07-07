
package z_thread_example;

public class Thread0011 extends Thread {

	private static int intCount = 0;
	
	
	public void run(){
		try {
			intCount++; 
			System.out.println(" intCount ==> " + intCount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void main(String [] args)
	{
		Thread0011 td1 = new Thread0011();
		Thread0011 td2 = new Thread0011();
		Thread0011 td3 = new Thread0011();

		
		td1.start();
		td2.start();
		td3.start();
		
	}
	
}
