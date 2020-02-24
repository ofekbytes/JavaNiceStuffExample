package a_02_Java_design_pattern.creational_Patterns.AbstractFactoryPattern;

/****
 * ColorFactory.java
 */
public class ColorFactory extends AbstractFactory {
	
	   @Override
	   public Shape getShape(String shapeType){
	      return null;
	   }
	   
	   @Override
	   Color getColor(String color) {
	   
	      if(color == null){
	         return null;
	      }		
	      
	      if(color.equalsIgnoreCase("RED")){
	         return new Red();
	         
	      }else if(color.equalsIgnoreCase("GREEN")){
	         return new Green();
	         
	      }else if(color.equalsIgnoreCase("BLUE")){
	         return new Blue();
	      }
	      
	      return null;
	   }
	}