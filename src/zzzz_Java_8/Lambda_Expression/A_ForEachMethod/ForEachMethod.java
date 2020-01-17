/**
 * 
 */
package zzzz_Java_8.Lambda_Expression.A_ForEachMethod;

import java.util.ArrayList;
import java.util.List;

public class ForEachMethod {

	// constructor
	public ForEachMethod() {
			}

	public static void main(String[] args) {
		List <Product> products = new ArrayList();
		
		products.add(new Product("id-01","phone - nokia 1122", 1500, 2, "nokia"));
		products.add(new Product("id-02","phone - nokia 2233", 1500, 3, "nokia"));
		products.add(new Product("id-03","phone - samsung 4", 2500, 4, "smasung"));
		products.add(new Product("id-04","phone - samsung 5", 3500, 4, "smasung"));
		products.add(new Product("id-04","phone - samsung 6", 4000, 5, "smasung"));
		
		System.out.println("Product List: ");
		products.forEach(product -> {
			System.out.println(product.toString());
		}
		);
	}

}
