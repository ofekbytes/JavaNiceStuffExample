package z_thread_example;

public class threadTestErea extends Thread {
	
	private static int threadCount = 0;

	public threadTestErea(){
		System.out.println("making thread ==  " + threadCount);
		
	}
	
	public void run() {
		threadCount ++;
		System.out.println("this is thread ==  " + threadCount);
	}
	
	public static void main(String [] args) {
		
		threadTestErea t = new threadTestErea();
		t.start();
		
	}
	
}