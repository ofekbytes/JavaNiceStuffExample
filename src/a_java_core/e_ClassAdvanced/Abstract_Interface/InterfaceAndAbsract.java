package a_java_core.e_ClassAdvanced.Abstract_Interface;

// class G_InterfaceAndAbsract implements G_InterfaceOne {
public class InterfaceAndAbsract implements InterfaceOne{

	
	@Override
	public void welcome() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int add(int num1, int num2) 
	{
    	int num3 = 0;
    	num3 = num1 - num2;
    	
    	return num3;
	}

	
	public double getPI()
	{
		return PI;
	}

	
	@Override
	public int takeAway(int num1, int num2) 
	{
    	int num3 = num1 - num2 + 30;
    	
    	return num3;

	}
	
}
