package z_z_delete.a_01_design_pattern.Creational_Patterns.One_FactoryPattern;

public class One_FactoryPattern 
{

	public static void main(String[] args) 
	{
		
		ShapeFactory shapeFactory = new ShapeFactory();
		
		//get an object of Circle and call its draw method.
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		
		//call draw method of Circle
		shape1.draw();
		
		
		//get an object of Rectangle and call its draw method.
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		
		//call draw method of Rectangle
		shape2.draw();
		
		
		//get an object of Square and call its draw method.
		Shape shape3 = shapeFactory.getShape("SQUARE");
		
		//call draw method of square
		shape3.draw();
		
		
		//call draw method of Circle - again
		shape1.draw();

	}

}
