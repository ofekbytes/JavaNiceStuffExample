package a_02_Java_design_pattern.creational_Patterns.FactoryPattern;

/****
 * Square.java
 */


/****
 * Step 2 
 * Create concrete classes implementing the same interface.
 */


public class Square implements Shape 
{

   @Override
   public void draw() 
   {
	   System.out.println("Inside Square::draw() method.");   
   }
	
}

