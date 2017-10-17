package f_Java_Advanced.ExceptionsHandling;


public class ExceptionHandlingExamples 
{
	/***
	 * AllExceptionHangling - catch all exceptions
	 */
	static void AllExceptionHangling() 
	{

		int arrGrades[] = new int [2];
		
		try 
		{
			System.out.println(arrGrades[3]);
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			System.out.println("An Error occurred - catch()");
			e.printStackTrace();
		}
	}//AllExceptionHangling
		


	
	static int div(int a, int b) throws ArithmeticException 
	{
		
		if (b==0) {
			throw new ArithmeticException("a -or- b is equal to zero/0");
		}
		else
		{
			return (a / b);
		}
		
	}
	

	static int divWithCatchs(int a, int b)
	{
		
		if (b==0) {
			throw new ArithmeticException("a -or- b is equal to zero/0");
		}
		else
		{
			return (a / b);
		}
		
	} //divWithCatchs

	
	
	
	public static void main(String[] args) 
	{
//		AllExceptionHangling();
		System.out.println("\n\n");
		System.out.println(div(33,0));
	} //main
}
