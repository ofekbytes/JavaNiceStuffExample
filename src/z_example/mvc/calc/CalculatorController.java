/***
 *
 * controller
 * 
 */


package z_example.mvc.calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController  {
	
	private CalculatorModel cmodel;
	private CalculatorView cview;
		
	public CalculatorController(CalculatorModel cm, CalculatorView cv) {
		this.cmodel = cm;
		this.cview = cv;
		
		
		this.cview.addCalculateListener(new CalculateListener());

		
		
	}
	
	
	class CalculateListener implements ActionListener {
		
		public void actionPerformed (ActionEvent e) {
			int firstNumber, secondNumber = 0;
			
			try 
			{
				firstNumber = cview.getTextFirstNumber();
				secondNumber = cview.getTextSecondNumber();
				cmodel.addTwoNumber(firstNumber, secondNumber);
				cview.setTextCalcSolution(cmodel.getCalcResult());
			}
			catch (NumberFormatException ex) 
			{
				System.out.println(ex);
				cview.displayErrorMessage("please enter Two/2 numbers");
			}
			
		}
	}
	
	
	
//	public static void main(String[] args) {		
//		// TODO Auto-generated method stub
//		
//		
//	}

}
