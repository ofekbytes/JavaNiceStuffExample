/**
 * 
 */
package d_java_08.Lambda_Expression.G_MapToInt_LongSumMethod;

import java.util.ArrayList;
import java.util.List;


public class MapToInt_LongSumMethod {

	// constructor
	public MapToInt_LongSumMethod() {
			}

	public static void main(String[] args) {
		List<Product> products = new ArrayList();
		
		// id, name, model, price, color, manufacturer, total //
		products.add(new Product("id-01","microwave", 1122, 500, "white" , "hemilton" ,2));
		products.add(new Product("id-02","toaster-oven", 1500, 600, "black", "hemilton" ,3));
		products.add(new Product("id-03","phone",4200,  1500, "black", "nokia" ,4));
		products.add(new Product("id-04","phone", 3200, 2500, "gray", "smasung" ,3));
		products.add(new Product("id-05","computer",3322, 4000, "green", "dell" ,2));
		
		System.out.println("Map-To-Int() - Sum() Method and print");

		int sum1 = products.stream()
					.mapToInt(p -> p.getModel())
					.sum();
		System.out.println("Sum All Product Models: " + sum1);
		
		
		int sum2 = products.stream()
					.filter(p -> p.getManufacturer().startsWith("hem"))
					.mapToInt(p -> p.getModel())
					.sum();		
		System.out.println("Sum All Manufacturer Models (start with 'hem') :  " + sum2);
		
		
		long sum3 = products.stream()
				.mapToLong(p -> p.getTotal() * p.getPrice())
				.sum();
		System.out.println("Total price: (all Total * all Price ===   " + sum3);
					
		
		long sum4 = products.stream()
				.filter(p -> p.getManufacturer().endsWith("kia"))
				.mapToLong(p -> p.getTotal() * p.getPrice())
				.sum();
		System.out.println("Sum All Manufacturer Models - (4 X 1500) - (end with 'kia') :  " + sum4);
	}

	
}
