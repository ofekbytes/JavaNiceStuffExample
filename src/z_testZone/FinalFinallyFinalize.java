package z_testZone;

public class FinalFinallyFinalize {

	public FinalFinallyFinalize() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


//Java final example
//
//class FinalExample{  
//public static void main(String[] args){  
//final int x=100;  
//x=200;//Compile Time Error  
//}}  



//Java finally example
//
//class FinallyExample{  
//public static void main(String[] args){  
//try{  
//int x=300;  
//}catch(Exception e){System.out.println(e);}  
//finally{System.out.println("finally block is executed");}  
//}}  


//Java finalize example
//
//class FinalizeExample{  
//public void finalize(){System.out.println("finalize called");}  
//public static void main(String[] args){  
//FinalizeExample f1=new FinalizeExample();  
//FinalizeExample f2=new FinalizeExample();  
//f1=null;  
//f2=null;  
//System.gc();  
//}}  