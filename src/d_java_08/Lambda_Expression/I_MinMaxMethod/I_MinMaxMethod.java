package d_java_08.Lambda_Expression.I_MinMaxMethod;

import java.util.ArrayList;
import java.util.List;

import d_java_08.Lambda_Expression.H_FilterCountMethod.Product;

public class I_MinMaxMethod {


	// constructor
	public I_MinMaxMethod() {
			}

	public static void main(String[] args) {
		List<Product> products = new ArrayList();
		
		// id, name, model, price, color, manufacturer, total
		products.add(new Product("id-01","microwave", 1122, 500, "white" , "hemilton" ,2));
		products.add(new Product("id-02","toaster-oven", 1500, 600, "black", "hemilton" ,3));
		products.add(new Product("id-03","phone",4200,  1500, "black", "nokia" ,4));
		products.add(new Product("id-04","phone", 3200, 2500, "gray", "smasung" ,3));
		products.add(new Product("id-05","computer",3322, 4000, "green", "dell" ,2));
		
		
		System.out.println("<1> product list MAX() Method()");
		Product maximum = products.stream()
				.max((value1, value2) -> (int) (value1.getPrice() - value2.getPrice()))
				.get();
		System.out.println("Product with MAX/maximum price:");
		System.out.println(maximum.toString());

		
		System.out.println("<2> product list MIN() Method()");
		Product minimum = products.stream()
				.min((value1, value2) -> (int) (value1.getPrice() - value2.getPrice()))
				.get();
		System.out.println("Product with MIN/minimum price:");
		System.out.println(minimum.toString());

	}
}
