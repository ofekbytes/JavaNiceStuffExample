package bpt;

public class Test {

	public Test() 
	{
		
		
	}	
	
	
//
// example 1:
//
	public void foo()
	{
		try 
		{
			throw new RuntimeException();
		} 
		finally 
		{
			System.out.println("in finally block");
		}		
	}

	public static void main (String [] args)
	{
			try {
				Test t = new Test();
				t.foo();
				System.out.println("Finish running");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	
/////////////////////////////////////

//
// example 2
//
//	public static void main (String [] args)
//	{
//		System.out.println(factorial(5));
//	}
//
//	
//public static long factorial (int n)
//{
//	if (n==1) return 1;
//	return n*factorial(n-1);
//}

}
