/**
 * 
 */
package z_z_delete.a_01_design_pattern.Creational_Patterns.One_FactoryPattern;


public class ShapeFactory  
{
	public Shape getShape(String shapeType)
	{
		
		if (shapeType == null)
		{
			return null;
		}
		
		
		if (shapeType.equalsIgnoreCase("CIRCLE") )
		{
			return new Circle();
		}
		else if (shapeType.equalsIgnoreCase("RECTANGLE") )
		{
	        return new Rectangle();	       
	    } 
		else if	(shapeType.equalsIgnoreCase("SQUARE"))
		{
			return new Square();
	    }
	
		return null;	
	}
	
	
}
