package z_example.basicExamples;

public class FinallyExample 
{	
	//global attributes/ variable
	private int [] arrOneDimensional = new int[4];

	public FinallyExample(int arrayIndex, int ArrayValue)
	{	System.out.println("arrayIndex == " + arrayIndex + " ArrayValue == " + ArrayValue);
		System.out.println("\nchange value with try..catch..finally validation");
		try{
			arrOneDimensional[arrayIndex] = ArrayValue;
			System.out.println("this syntax will throw an exception (catch)");
		}
		catch (Exception e) {
			System.out.println("catch.. exception" + e);
		}
		finally {
			System.out.println("finally will be execute anyway");			
		}		
	}
}
