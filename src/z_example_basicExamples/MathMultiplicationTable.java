package z_example_basicExamples;

public class MathMultiplicationTable {

	
	/***
	 * space alignment method/function
	 * @param number - receive a number and make the proper space alignment
	 */
	public void fnPrint(int number) {
	
		if (number == 0) {
			System.out.print("    X");
		}
		
//		//1 digit number space
		if (number > 0 && number <= 9) 
			System.out.print("    " + number); // 3x space/s

		
//		//2 digit number space
		if (number >= 10 && number <= 99)
			System.out.print("   " + number); // 2x space/s

		
//		//2 digit number space
		if (number >= 100 && number <= 999)
			System.out.print("  " + number); // 2x space/s
	}

	
	/***
	 * 
	 * @param count - total number (default 10x10 = 100)
	 */
	
	public void MathMultiplicationTable(int count) {
		

		System.out.println("\nMultiplication table \n");
		
		// header - 1..max
		for (int header = 0; header <= count; header++) {		
			fnPrint(header);	
		}
	
		
//		//table + left header
		for (int x=1; x<= count; x++) {
//			//left header 
			System.out.println("");			
			fnPrint(x);
			
			
//			//table MathMultiplication Table
			for (int y=x; y<=x*count; y=y+x)
			{	
				fnPrint(y);
			}
		}		
	}
	
	
	//Start here.
	public static void main(String[] args) 
	{	
		MathMultiplicationTable mt = new MathMultiplicationTable();
		mt.MathMultiplicationTable (20); //10 = 10x10; 20=20x20
	}

}
