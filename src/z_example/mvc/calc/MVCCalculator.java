/**
 * 
 * MVC Main...
 */
package z_example.mvc.calc;


public class MVCCalculator {



	public static void main(String[] args) {
		CalculatorModel model = new CalculatorModel(); 
		CalculatorView view = new CalculatorView();
		CalculatorController controller = new CalculatorController(model, view);

		//view.setVisible(true);

	}

}
