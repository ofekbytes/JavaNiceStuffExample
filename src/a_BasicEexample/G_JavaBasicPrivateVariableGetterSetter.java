package a_BasicEexample;

public class G_JavaBasicPrivateVariableGetterSetter {

	private int id = 0; 
	private String lastName = ""; 
	private String FirstName = "";
	

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	//constructor "G_JavaBasicPrivateVariableGetterSetter"
	public G_JavaBasicPrivateVariableGetterSetter() {
		
		//Nothing yet
	}

	public static void main(String[] args) {

		G_JavaBasicPrivateVariableGetterSetter jbpvg = new G_JavaBasicPrivateVariableGetterSetter();
		
		//setter
		jbpvg.setId(1234567);
		jbpvg.setLastName("levi");
		jbpvg.setFirstName("avi");
		
		//getter
		System.out.println(jbpvg.getId());
		System.out.println(jbpvg.getLastName());
		System.out.println(jbpvg.getFirstName());
	
	}
	
	
}//end of class
