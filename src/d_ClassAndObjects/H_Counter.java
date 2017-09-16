package d_ClassAndObjects;

public class H_Counter 
{
	// static attribute
	public static int COUNT=0; 
	
	//method / constructor
	public H_Counter() {
		COUNT++;
	}
	
	
	//static method
	public static void version()
	{
		System.out.println("Version 1.4");
	}
}
