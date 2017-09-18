package e_ClassAdvanced;


public class G_InterfaceMainCall extends G_InterfaceAndAbsract //implements G_InterfaceOne
{
	@Override
	public void welcome() {
		System.out.println("Welcome");
	}

	
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}


	//constructor
	public G_InterfaceMainCall() {
		welcome();
	}


	public static void main(String[] args) {
		G_InterfaceAndAbsract mainG = new G_InterfaceAndAbsract();	
		System.out.println("PI === " + mainG.getPI());
	}

	
}
