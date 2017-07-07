
package z_thread_example;

//extends Thread to class
public class Thread001 extends Thread {

	public void run(){
		System.out.println("run a Thread");
	}
	
	public static void main(String [] args)
	{
		Thread001 td1 = new Thread001();
		td1.start(); //run()
	}
	
}
