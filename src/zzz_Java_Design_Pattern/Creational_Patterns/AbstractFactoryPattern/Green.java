package zzz_Java_Design_Pattern.Creational_Patterns.AbstractFactoryPattern;

/**** 
 * Step4
 * 
 * Create concrete classes implementing the same interface.
 */


/****
 * Green.java
 */
public class Green implements Color 
{
   @Override
   public void fill() 
   {
	   System.out.println("Inside Green::fill() method.");
   }
}