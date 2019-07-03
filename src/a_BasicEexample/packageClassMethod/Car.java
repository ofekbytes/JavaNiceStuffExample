package a_BasicEexample.packageClassMethod;

public class Car {
	public Car() {
		drive(50);
	}

	private void drive(int speed) {
		System.out.println("speed is " + speed);
	}

	public static void main(String[] args) {
		Car c = new Car();
	}
}
