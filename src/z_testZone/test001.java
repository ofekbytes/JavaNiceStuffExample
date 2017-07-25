package z_testZone;

public class test001 {

	//Constant value
	private static final int j = 10; //jack
	private static final int q = 11; //queen
	private static final int k = 12; //king
	private static final int a = 13; //ace
	private static final int J = 14; //joker
	public test001() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("constant value");
		System.out.printf("j = %d ,q = %d ,k = %d ,a =%d , J = %d " ,j ,q ,k ,a ,J );
		
		System.out.println("");
		if (j > a) 
			System.out.println("yes");
		else
			System.out.println("no");
	}

}
