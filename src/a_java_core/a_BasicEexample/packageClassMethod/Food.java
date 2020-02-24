package a_java_core.a_BasicEexample.packageClassMethod;

public class Food {
	public Food() {
		Dinner();
	}

	private void Dinner() {
		System.out.println("1. Dinner");
		mainCourse();
		dessert();
	}

	private void mainCourse() {
		System.out.println("2. MainCourse");
		buildWater();
	}

	private void buildWater() {
		System.out.println("3. BuildWater");
	}

	private void dessert() {
		System.out.println("4. Dessert");
	}

	public static void main(String[] args) {
		Food f = new Food();
	}
}
