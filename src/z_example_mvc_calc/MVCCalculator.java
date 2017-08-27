/**
 * 
 * MVC Main...
 */
package z_example_mvc_calc;

/**
 * @author yaron
 *
 */
public class MVCCalculator {

	/**
	 * 
	 */
	public MVCCalculator() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CalculatorModel model = new CalculatorModel(); 
		CalculatorView view = new CalculatorView();
		CalculatorController controller = new CalculatorController(model, view);

//		//test333ffdd
	}

}
