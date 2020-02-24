package a_java_core.d_ClassAndObjects;

public class I_Constant 
{
	private static final double PI = 3.14;
	
	//get pi value
	public static double getPi() {
		return PI;
	}

	public static void main(String[] args) 
	{	
		System.out.println("PI === " + PI);
	}
}
