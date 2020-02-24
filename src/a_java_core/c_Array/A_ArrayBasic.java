package a_java_core.c_Array;
/***
 * 
 * array: an array is a collection of variables of the same type.
 *
 */


/*****
 * 
 * Array Basic
 *
 */

public class A_ArrayBasic {

	//global attributes/ variable
	private int [] arrOneDimensional = new int[4];
	
	
	
	
	//write data to One Dimensional Array Object
	public void ArrayOneDimensionalWrite() {
		//local variable
		int index = 0;
		for (index = 0; index < arrOneDimensional.length; index++)
			arrOneDimensional[index]=index;		
	}
	

	
	//read Array from One Dimensional Array Object
	public void ArrayOneDimensionalRead()	{
		//local variable
		int index = 0;
		for (index = 0; index < arrOneDimensional.length; index++)
			System.out.print("  " + arrOneDimensional[index]);
	}
	
	
	
	//overwrite One Dimensional Array value  
	public void ArrayOneDimensionalChangeValue(int arrayIndex, int ArrayValue)
	{
		System.out.println("\n change value with if() length validation");
		
		//check if the value we wish to change is array valid
		if (arrayIndex <= arrOneDimensional.length)
		{
			arrOneDimensional[arrayIndex] = ArrayValue;
		
		System.out.println("\narrCount[" + arrayIndex + "] == " + arrOneDimensional[arrayIndex]);
		}
		else 
		System.out.println("array out of scope");
	}
	


	
	//overwrite One Dimensional Array value  
	public void ArrayOneDimensionalChangeValue2(int arrayIndex, int ArrayValue)
	{
		
		System.out.println("\n change value with try..catch..finally validation");
		
		//check if the value we wish to change is array valid
		try{
			arrOneDimensional[arrayIndex] = ArrayValue;
			System.out.println("\narrCount[" + arrayIndex + "] == " + arrOneDimensional[arrayIndex]);
		}
		catch (Exception e) {
			//System.out.println("~catch: array out of scope");
			//System.out.println(e.hashCode() + " " + e.getMessage()+ " " + e.getCause());
			System.out.println(e);
		}
		//allways work (use to close DataBase connection, close file, ,
		finally {
			System.out.println("error... max array length is : " + arrOneDimensional.length + " value entered is: " + arrayIndex );			
		}

		
//		try{ }
//		catch (Exception e) { }
//		finally { }			
		
	}

	
	
	//One Dimensional Array: read boy/s and girl/s names
	public void getBoysGirlsNames(){

		//variable
		String [] BoysNames = new String [] {"Liam","Mason", "Aiden", "Logan", "Lucas"} ;
		String [] GirlsNames = {"Emma", "Olivia", "Sophia", "Mia", "Harper"};
		
		
		//
		System.out.println("\nBoys Names: (BoysNames.length == [" + BoysNames.length + "])");
		for (int i = 0; i < BoysNames.length; i++) {
			System.out.print( BoysNames[i] + " , ");
		}

		
		System.out.println("\n ");
		System.out.println("\nGirls Names: (GirlsNames.length == [" + GirlsNames.length + "])");
		for (int i = 0; i < GirlsNames.length; i++) {
			System.out.print(GirlsNames[i] + " , ");
		}	
	}
	
	
	
	/****
	 * enhanced for loop One Dimensional Array/ for each loop
	 */
	public void getEnhancedForLoopOneDimensionalArray() {
		
		int [] arrCount = new int[] {9,8,7,6,5,4,3,2,1,0};

		
		System.out.println("\n\nEnhanced For Loop (for each)");
		System.out.println("for-each<<>>for");
		/****
		 * each iteration of the loop, 
		 * the variable "i" will be equal to the corresponding elements in the array "arrCount"
		 * "i" = "arrCount[index]"
		 */
		int j = 0;
		for (int i: arrCount)
		{
			System.out.print(i + "<<>>" + arrCount[j] + " , ");
			j++;		
		}
	}
	
	
	
	/****
	 * One Dimensional Array: Class/Student Grades statistics 
	 */
	public void getGradesStatus() {
	
		int [] arrfixedDatagrades = new int[] {22,88,60,77,13};  //not in used
		int totalGrades = 0;
		int averageGrades = 0;
		int totalStudents = arrfixedDatagrades.length;

		
		
		System.out.println("\n\nTotal student: " + arrfixedDatagrades.length);
		
		for (int i = 0; i < arrfixedDatagrades.length; i++)
		{
			System.out.println("student #" + (i+1) + "   grade: " + arrfixedDatagrades[i]);
			totalGrades = totalGrades + arrfixedDatagrades[i];			
		}
		
		averageGrades = totalGrades / totalStudents;
		System.out.println("\n*** class average Grades is: " + averageGrades);
		
		
		/***
		 * Grade Maximum / minimum
		 */
		
		int maxGrade=0;
		int maxGradePointer=0;
		int minGrade=0;
		int minGradePointer=0;
		
		for (int x=0; x < arrfixedDatagrades.length; x++)
		{
			maxGrade = arrfixedDatagrades[x];
			minGrade = arrfixedDatagrades[x];
			
			for (int y=0; y < arrfixedDatagrades.length; y++)
			{
				if (maxGrade < arrfixedDatagrades[y])
				{
					maxGrade = arrfixedDatagrades[y];
					maxGradePointer = y;				
				}
				
				if (minGrade > arrfixedDatagrades[y])
				{
					minGrade = arrfixedDatagrades[y];
					minGradePointer = y;
				}
			}
		}
		
		System.out.println("Maximum grade point is: " + (maxGradePointer+1) + "  " + arrfixedDatagrades[maxGradePointer]); //Maximum Grade
		System.out.println("Minimum grade point is: " + (minGradePointer+1) + "  " + arrfixedDatagrades[minGradePointer]); //minimum Grade	
	}
	
	
	
	public void printUpsideDown(String stName) {
		
		char ch[];
		
		//take the String "stName" and assign it to char array "ch[]".
		ch = stName.toLowerCase().toCharArray();
		
		//print the String
		System.out.println("the Name is= " + stName);
		
		//Print the char array (letter by letter)
		System.out.println("\nprint ch array (letter by letter) ");
		for (char chText : ch) {
			System.out.print(chText + " ");
		}
		
		
		System.out.println("\n\nprint ch array upside down");
		
		//Print the char array (letter by letter) upside down
		int idx = ch.length-1;
		for ( ; idx >= 0 ; idx-- ) {
			System.out.print(ch[idx] + " ");
		}
		
//		TODO: Yak it
		//System.out.println("\n"+ch);
		
	}
	
	
	
	/****
	 * enhanced for loop Two Dimensional Array/ for each loop
	 */
	public void getEnhancedForLoopTwoDimensionalArray() {
		
		int [][] arrCount = new int[][] {{11,22,33}, 
										 {21,22,23}, 
										 {31,32,33}};

										 
		System.out.println("\n\nEnhanced For Loop Two Dimensional (for each)");
										 
		for (int[] i: arrCount) {
			
			for (int j: i) {
				System.out.print(" " + j);				
			}
			System.out.println("");
		}
	}
	
	
	
	/****
	 * 
	 * Multidimensional Array - array that contain fixed arrays, equal row/column.
	 * TWO Dimensional Array
	 */
	public void ReadMultidimensionalArray()
	{
		int [][] arrExample = new int[][] {{1,2,3}, 
										   {4,5,6} ,
										   {7,8,9}};
											
		int [][] arrExample2 = {{1,2,3}, 
								{4,5,6} ,
								{7,8,9}};
		
		System.out.println("\n\n Multidimensional Array");
		System.out.println("arrExample[0][1] === "+arrExample[0][1]);
		System.out.println("arrExample2[1][2] === " + arrExample2[1][2]);			
	}
	
	

	/****
	 * 
	 * Multidimensional Array - array that contain fixed arrays, none equal column row/column.
	 * TWO Dimensional Array
	 */
	public void ReadWriteMultidimensionalArray2(int row, int col) {

		int [][] arrExample2 = {{1,2,3}, 
								{6} ,
								{7,8,9}};
		
		
		//read from 2d array - fixed array
		System.out.println("\n\nread 2D array - fixed array~~~");
		for (int r=0; r < arrExample2.length; r++) {

			for (int c=0 ; c < arrExample2[r].length; c++) {
				System.out.print(r + "." + c + " === " + arrExample2[r][c] + "  ");				
			}
			System.out.println("");
		}
	}


	
    /***
     * TWO Dimensional Array - dynamic allocated from object to method as parameters. 
     * @param row - number of rows
     * @param col - number of columns
     */
	public void ReadWriteMultidimensionalArray(int row, int col) {

		int [][] arrExample = new int[row][col];

		
		System.out.println("\n\nread 2D array - fixed array~~~");
		
		//write to 2d array
		for (int r=0; r < arrExample.length; r++) {
			for (int c=0 ; c < arrExample[r].length ; c++) {
				arrExample[r][c] = r + c;
			}
		}
		
				
		//read from 2d array
		for (int r=0; r < arrExample.length; r++) {
			System.out.println("");
			for (int c=0 ; c < arrExample[r].length; c++) {
				System.out.print(r + "." + c + " === " + arrExample[r][c] + "  ");				
			}
		}
	}
		
	
	
	private void ArrayString2D() {
		
		String [][] stArray2D = {{"i","you","we","they"},{"am","are","is"},{"working","works", "worked"}};

		System.out.println("String for()");
		for (int x=0; x < stArray2D.length; x++) {
			System.out.println("");
			for (int y=0; y < stArray2D[x].length; y++) {
				System.out.print(stArray2D[x][y] + " , ");
			}
		}
		
		
		System.out.println("\n");
		
		System.out.println("String enhanced for loop / for..each()");
		for (String [] stx: stArray2D) {
			System.out.println("");
			for  (String sty: stx){
				System.out.print(sty + " , ");
				
			}			
		}
				
	}

	
	//execute constructor - 2 method/s
	public A_ArrayBasic() {
		
		System.out.println("\nA_ArrayBasic constructor:");
//		
//		//1D array with global attributes/variable array integer
//		ArrayOneDimensionalWrite(); //1D
//		ArrayOneDimensionalRead();  //1D
//		ArrayOneDimensionalChangeValue(8,223); //1D with if validation check 
//		ArrayOneDimensionalChangeValue2(8,223); //1D with try..catch..finally validation check

		
//		//1D String array
//		getBoysGirlsNames();
		
//		//enhanced for loop One Dimensional Array/ for each loop
//		getEnhancedForLoopOneDimensionalArray(); 
		
//		//enhanced for loop Two Dimensional Array/ for each loop
//		getEnhancedForLoopTwoDimensionalArray();
		
		
//		//print Upside Down
		printUpsideDown("text me");
		
//		//read fixed 2d array
//		ReadMultidimensionalArray();
		
//		//read fixed 2d array - array not simetric
//		ReadWriteMultidimensionalArray2(6,6);
		
//		//write / read to array
//		ReadWriteMultidimensionalArray(5, 5);	
		
//		//One Dimensional Array: Class/Student Grades statistics 
//		getGradesStatus();
		
		
		//array Two Dimensional with String [][]
//		ArrayString2D();

	}
	
	
	
	public static void main(String [] args) {
		
		//object (instance of the class) created --> constructor run first.
		A_ArrayBasic a = new A_ArrayBasic(); 
				
	}
	
} // A_ArrayBasic
