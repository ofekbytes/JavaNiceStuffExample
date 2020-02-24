package a_java_core.e_ClassAdvanced.Abstract_Interface;


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


    @Override
    public int takeAway(int num1, int num2) 
    {
    	int num3 = num1 - num2;
    	
    	return num3;
    }	
	
	
	//constructor
	public InterfaceMainCall() {
		welcome();
	}


	public static void main(String[] args) {
		InterfaceMainCall gf = new InterfaceMainCall();
		System.out.println(gf.getPI());
		//System.out.println 
		System.out.println("220 + 80 === " +  gf.add(220, 80) );
		System.out.println("220 - 80 === " +  gf.takeAway(220, 80) );
//		G_InterfaceAndAbsract mainG = new G_InterfaceAndAbsract();	
//		System.out.println("PI === " + mainG.getPI());
	}

	
}
