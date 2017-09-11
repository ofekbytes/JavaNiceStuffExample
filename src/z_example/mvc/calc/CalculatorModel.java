/**
 * 
 * Model
 * 
 */
package z_example.mvc.calc;


public class CalculatorModel {

	private int calcResult = 0;
	
	public void addTwoNumber(int firstNumber, int secondNumber)
	{
		calcResult = firstNumber + secondNumber;
	}
	
	public int getCalcResult()
	{
		return calcResult;
	}
	
	public CalculatorModel() {

	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
