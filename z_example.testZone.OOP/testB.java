package OOP;

public class testB extends testA{

	public testB() {
		System.out.println("testB");
		
		System.out.println("IntinheritanceValue === " + super.IntinheritanceValue);
		super.IntinheritanceValue = 100;
		System.out.println("IntinheritanceValue === " + IntinheritanceValue);
	}
}
