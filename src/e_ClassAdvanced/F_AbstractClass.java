package e_ClassAdvanced;


abstract class Mycars 
{	
	private int wheels;
	abstract void getwheels();
	abstract void beep();
}

class MyFiat extends Mycars
{
	int wheels = 4;
	
	@Override
	void beep() {
		System.out.println("Fiat beep");
	}
	
	
	@Override
	void getwheels() {
		System.out.println("wheels == " + wheels);
	}
}

 
class F_AbstractClass 
{
	public static void main(String[] args) 
	{
		MyFiat f = new MyFiat();
		f.beep();
		
		f.getwheels(); //=== 4
		
		f.wheels++;
		f.getwheels(); //=== 5

	}	
}

