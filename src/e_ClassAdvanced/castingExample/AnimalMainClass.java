package e_ClassAdvanced.castingExample;

class AnimalMainClass {

	public AnimalMainClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
//		Cat c = new Cat();
//		c.walk(); //call SupperClass method
		
		/*
		 * 
		 */
		
		System.out.println("cat>>\n");		
		Animal c = new Cat();
		System.out.println(" The Animal:\n Type == "+  c.animalType + "\n Age == " + c.age);
		
		System.out.println("dog>>\n");
		Animal d = new Cat();
		System.out.println(" The Animal:\n Type == "+  d.animalType + "\n Age == " + d.age);
		
	}

}
