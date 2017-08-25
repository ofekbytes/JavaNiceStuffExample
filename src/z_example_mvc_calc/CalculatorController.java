/***
 *
 * controller
 * 
 */


package z_example_mvc_calc;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorController  {
	
	private CalculatorModel cmodel;
	private CalculatorView cview;
		
	public CalculatorController(CalculatorModel cm, CalculatorView cv) {
		cmodel = cm;
		cview = cv;
		
		System.out.println("first number"  + cview.getTextFirstNumber());
	}
	
	public CalculatorController() {
		
		

	}

	
	public static void main(String[] args) {		
		// TODO Auto-generated method stub
		
		
	}

}
