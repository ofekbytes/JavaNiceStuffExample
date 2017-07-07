package z_basicExamples;

public class MathMultiplicationTable {

	
	/***
	 * space alignment method/function
	 * @param number - receive a number and make the proper space alignment
	 */
	public void fnMakeSpace(int number) {
	
		//space it :-)
		System.out.println("");
	}

	
	/***
	 * 
	 * @param count - total number (default 10x10 = 100)
	 */
	
	public void MathMultiplicationTable(int count) {
		

		System.out.println("\nMultiplication table \n");
		
		// header - 1..max
		for (int header = 0; header <= count; header++) {
	
			if (header == 0) {
				System.out.print("   X");
			}
			
//			//header 1 digit number space
			if (header > 0 && header <= 9) 
				System.out.print("   " + header); // 3x space/s

//			//header 2 digit number space
			if (header >= 10 && header <= 99)
				System.out.print("  " + header); // 2x space/s
		}
		
		
//		//table + left header
		for (int x=1; x<= count; x++)
		{
//			//left header 
			System.out.println("");
			
//			//left header 1 digit number space
			if (x <= 9)
			  System.out.print("   " + x);
			
//			//left header 2 digit number space
			if (x >= 10 && x <= 99) 
			  System.out.print("  " + x);
			
			
//			//table MathMultiplication Table
			for (int y=x; y<=x*count; y=y+x)
			{
//				//MathMultiplication Table with 1 digit space
				if (y > 0 && y <= 9) 
					System.out.print("   " + y); 
	
//				//MathMultiplication Table with 2 digit space				
				if (y >= 10 && x <= 99)
					System.out.print("  " + y); 
			}
		}		
//		System.out.println("\n");
	}
	
	public MathMultiplicationTable() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		MathMultiplicationTable mt = new MathMultiplicationTable();
		mt.MathMultiplicationTable (11);
		// TODO Auto-generated method stub

	}

}
