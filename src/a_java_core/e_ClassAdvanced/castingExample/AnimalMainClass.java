package a_java_core.e_ClassAdvanced.castingExample;

class AnimalMainClass {

	public AnimalMainClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
//		Cat c = new Cat();
//		c.walk(); //call SupperClass method
		
		/*
		 * UpCasting -
		 * you can cast an (object) instance of subclass to its superclass.
		 * cat is a subclass of Animal.
		 */
		
		System.out.println("cat>>\n");		
		Animal c = new Cat();
		System.out.println(" The Animal:\n Type == "+  c.animalType + "\n Age == " + c.age);
		
		System.out.println("dog>>\n");
		Animal d = new Cat();
		System.out.println(" The Animal:\n Type == "+  d.animalType + "\n Age == " + d.age);
		
		
		System.out.println("");
		
		/*** 
		 * DownCasting - 
		 * Casting an object of SupperClass to its SubClass is called downcasting.
		 */
		try {
			Animal an = new Animal();
			((Cat)an).walk();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		/****
		 * -!- upcasting automatic , because upcasting can never fail.
		 */
		
	}

}
;