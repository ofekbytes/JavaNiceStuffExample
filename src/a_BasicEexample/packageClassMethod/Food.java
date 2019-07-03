package a_BasicEexample.packageClassMethod;

public class Food {
	public Food() {
		Dinner();
	}

	private void Dinner() {
		System.out.println("Dinner");
		mainCourse();
		dessert();
	}

	private void mainCourse() {
		System.out.println("mainCourse");
		buildWater();
	}

	private void buildWater() {
		System.out.println("buildWater");
	}

	private void dessert() {
		System.out.println("dessert");
	}

	public static void main(String[] args) {
		Food f = new Food();
	}
}
