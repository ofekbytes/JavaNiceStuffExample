package zzzz_Java_8.Lambda_Expression.H_FilterCountMethod;


import java.util.ArrayList;
import java.util.List;


public class H_FilterCountMethod {

	// constructor
	public H_FilterCountMethod() {
			}

	public static void main(String[] args) {
		List<Product> products = new ArrayList();
		
		// id, name, model, price, color, manufacturer, total
		products.add(new Product("id-01","microwave", 1122, 500, "white" , "hemilton" ,2));
		products.add(new Product("id-02","toaster-oven", 1500, 600, "black", "hemilton" ,3));
		products.add(new Product("id-03","phone",4200,  1500, "black", "nokia" ,4));
		products.add(new Product("id-04","phone", 3200, 2500, "gray", "smasung" ,3));
		products.add(new Product("id-05","computer",3322, 4000, "green", "dell" ,2));
		
		
		System.out.println("<1> product list bigger then 700 - using - filter() + forEach()");
		products.stream()
			.filter(p -> p.getPrice() > 700)
			.forEach(p -> {
				System.out.println(p.toString());
			});
		

		Long result1 = products.stream()
					   .filter(p -> p.getPrice() > 700)
					   .count();	
		System.out.println("*** Price Total Records = " + result1 + " ***");
		

		
		System.out.println("\n<2> product manufacturer with the name 'kia' - using - filter() + forEach()");
		products.stream()
		.filter(p -> p.getManufacturer().endsWith("kia"))
		.forEach(p-> {
			System.out.println(p.toString());
		});

		Long result2 = products.stream()
				.filter(p -> p.getManufacturer().endsWith("kia"))
				.count();	
		System.out.println("*** manufacturer Total Records = " + result2 + " ***");

	}

	
}
