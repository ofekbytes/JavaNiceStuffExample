package z_example.testZone.bpt;

public class A {

	public A() 
	{
		
	}

	public void printStuff()
	{
		System.out.println("printStuff in A");
	}
	
	public static void main (String [] args)
	{
		A a = new B();
		a.printStuff();
	}
}


