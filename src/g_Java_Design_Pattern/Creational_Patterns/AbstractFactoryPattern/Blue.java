package g_Java_Design_Pattern.Creational_Patterns.AbstractFactoryPattern;

/**** 
 * Step4
 * 
 * Create concrete classes implementing the same interface.
 */


/****
 * Blue.java
 */

public class Blue implements Color 
{
   @Override
   public void fill() 
   {
	   System.out.println("Inside Blue::fill() method.");
   }
}