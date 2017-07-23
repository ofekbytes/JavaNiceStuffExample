package z_basicExamples;

public class FinalizeExample {

	/**
	 * Finalize is a method - clean process before exit.
	 */
	public void finalize()
	{
		System.out.println("finalize Method is executed");
	}
	
	public FinalizeExample() {
		System.out.println("execute FinalizeExample Method Contructor");
	}
	
	
	
}
