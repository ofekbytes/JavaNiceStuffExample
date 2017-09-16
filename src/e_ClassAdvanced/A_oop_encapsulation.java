package e_ClassAdvanced;

public class A_oop_encapsulation {
	
	private String FName = "";
	private String LName = "";
	private int age;
	
	public String getFName() {
		return FName;
	}

	public void setFName(String fName) {
		FName = fName;
	}

	public String getLName() {
		return LName;
	}

	public void setLName(String lName) {
		LName = lName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	public A_oop_encapsulation() 
	{
		setFName("eli");
		setLName("lee");
		setAge(22);
		
		System.out.println(getFName() + " , " + getLName() + " , " + getAge());
	}

	public static void main(String[] args) {
		A_oop_encapsulation aop = new A_oop_encapsulation();
	}
}
