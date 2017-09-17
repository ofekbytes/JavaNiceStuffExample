package e_ClassAdvanced;

public class E_overridingMethod 
{	
	static double add (double num1, double num2) {
		return num1 + num2;
	}

	static int add (int num1, int num2) {
		return num1 + num2;
	}

	public static void main(String[] args) {
		System.out.println(add(22,33));
		System.out.println(add(22.3,33.2));
	}
}
