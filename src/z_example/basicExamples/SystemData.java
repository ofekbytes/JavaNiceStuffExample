package z_example.basicExamples;

public class SystemData {

	public SystemData() {
		
		//time
		long startTime = System.currentTimeMillis();
		long estimatedTime = System.currentTimeMillis() - startTime;
		long estimatedTime2 = System.nanoTime() - startTime;
		
		System.out.println("startTime == " + startTime + " estimatedTime == " + estimatedTime + " estimatedTime == " + estimatedTime) ;
	}

	public static void main(String[] args) {

		SystemData sd = new SystemData();
	}

}
