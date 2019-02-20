package g_Java_Design_Pattern.Creational_Patterns.FactoryPattern;

/****
 * Nan.java
 */


/****
 * Step 2 
 * Create concrete classes implementing the same interface.
 */


public class Nan implements Shape 
{

   @Override
   public void draw() 
   {
	   System.out.println("Inside Nan::draw() method.");   
   }
	
}

