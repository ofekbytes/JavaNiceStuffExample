package a_java_core.d_ClassAndObjects;

public class C_OOP_constructor {

	private int number1=0, number2=0;
	
	public C_OOP_constructor() {
		this.number1 = 10;
		this.number2 = 20;
		
		System.out.printf("\n%4d +%4d =%4d",number1, number2, number1 + number2);
	}
	
	public C_OOP_constructor(int num1, int num2) {
		this.number1 = num1;
		this.number2 = num2;
		
		System.out.printf("\n%4d +%4d =%4d",number1, number2, number1 + number2);
	}


	public static void main(String[] args) {
		C_OOP_constructor coop = new C_OOP_constructor();
		C_OOP_constructor oop2 = new C_OOP_constructor(33,22);
	}

}
