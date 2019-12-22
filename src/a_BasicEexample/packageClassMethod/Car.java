package a_BasicEexample.packageClassMethod;

public class Car {
	public Car() {
		drive(0);
	}

	private void drive(int speed) {
		System.out.println("Current car speed is: " + speed);
	}

	public static void main(String[] args) {
		Car c = new Car();
		c.drive(70);
	}
}
