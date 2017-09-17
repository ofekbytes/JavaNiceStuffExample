package e_ClassAdvanced;


//SupperClass Animals
class Animels
{
	public void makeSound()
	{
		System.out.println("Soundit");
	}

}


//SubSlass - Cats
class Cats extends Animels {
	public void makeSound() {
		System.out.println("Sound of mitzi");
	}
}


//SubClass - Dog
class Dogs extends Animels {
	
	public void makeSound() {
		System.out.println("Sound of Rexi");
	}
}


public class D_AnimalSoundsClass {

	public static void main(String[] args) {
		Cats c = new Cats();
		Dogs d = new Dogs();
		
		c.makeSound();
		d.makeSound();
	}
}
