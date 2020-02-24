package a_java_core.d_ClassAndObjects;

public class H_Counter_Main 
{
	public static void main(String[] args) {	
		H_Counter hc = new H_Counter();  //==1
		System.out.println("count == " + hc.COUNT);
		
		H_Counter hc2 = new H_Counter(); //==2
		System.out.println("count == " + hc2.COUNT);
		
		hc2.COUNT++;
		System.out.println("count == " + hc2.COUNT);
		
		//calling Static Varaible
		H_Counter.version();
	}
}
