package compares;

public class Excel {

	public Excel() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * MVC
	 * Model >> ModelExcel >> model
	 * View >> ViewExcel
	 * Controller >> ControllerExcel
	 */
	public static void main(String[] args) 
	{	
		ModelExcel model = new ModelExcel(); 
		ViewExcel view = new ViewExcel();
		ControllerExcel controller = new ControllerExcel(model, view);		
	}

}
