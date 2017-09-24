package e_ClassAdvanced.Abstract_Interface;


public class InterfaceMainCall extends InterfaceAndAbsract //implements G_InterfaceOne
{
	@Override
	public void welcome() {
		System.out.println("Welcome, ");
	}

	
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}


	//constructor
	public InterfaceMainCall() {
		welcome();
	}


	public static void main(String[] args) {
		InterfaceMainCall gf = new InterfaceMainCall();
		System.out.println(gf.getPI());
		
//		G_InterfaceAndAbsract mainG = new G_InterfaceAndAbsract();	
//		System.out.println("PI === " + mainG.getPI());
	}

	
}
