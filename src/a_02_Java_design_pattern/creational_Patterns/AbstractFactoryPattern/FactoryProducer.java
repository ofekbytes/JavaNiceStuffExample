package a_02_Java_design_pattern.creational_Patterns.AbstractFactoryPattern;

/****
 * Step 7 
 * Create a Factory generator/producer class to get factories 
 * by passing an information such as Shape or Color
 */


/****
 * FactoryProducer.java
 */
public class FactoryProducer {
	   public static AbstractFactory getFactory(String choice){
	   
	      if(choice.equalsIgnoreCase("SHAPE")){
	         return new ShapeFactory();
	         
	      }else if(choice.equalsIgnoreCase("COLOR")){
	         return new ColorFactory();
	      }
	      
	      return null;
	   }
	}