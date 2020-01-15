/**
 * 
 */
package zzzz_Java_8.Lambda_Expression.ForEach_filter_Method;

import java.util.ArrayList;
import java.util.List;

public class ForEachMethod {

	// constructor
	public ForEachMethod() {
			}

	public static void main(String[] args) {
		List products = new ArrayList();
		
		products.add(new Product("id-01","phone - nokia 1122", 1500, 2, "nokia"));
		products.add(new Product("id-02","phone - nokia 2233", 1500, 3, "nokia"));
		products.add(new Product("id-03","phone - samsung 4", 2500, 4, "smasung"));
		products.add(new Product("id-04","phone - samsung 5", 3500, 4, "smasung"));
		products.add(new Product("id-04","phone - samsung 6", 4000, 5, "smasung"));
		
		System.out.println("Product List - with OR (||) condition");
		products.stream().filter(p -> p.getId().equalsIgnoreCase("id-01") || p.getId().equalsIgnoreCase("id-03"))
				.forEach(p -> {
					System.out.println(p.toString());
					System.out.println("=================================");
				});
		    
	}

}
