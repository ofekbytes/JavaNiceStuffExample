package d_java_08.Lambda_Expression.J_GroupByMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import d_java_08.Lambda_Expression.H_FilterCountMethod.Product;

public class J_GroupByMethod {

	// constructor
	public J_GroupByMethod() {
			}

	public static void main(String[] args) {
		List<Product> products = new ArrayList();
		
		// id, name, model, price, color, manufacturer, total
		products.add(new Product("id-01","microwave", 1122, 500, "white" , "hemilton" ,2));
		products.add(new Product("id-02","toaster-oven", 1500, 600, "black", "hemilton" ,3));
		products.add(new Product("id-03","phone",4200,  1500, "black", "nokia" ,4));
		products.add(new Product("id-04","phone", 3200, 2500, "gray", "smasung" ,3));
		products.add(new Product("id-05","computer",3322, 4000, "green", "dell" ,2));
		
		
		System.out.println("<1> count the number of products in each group <getManufacturer>");
		Map group = products.stream()
							.collect(Collectors.groupingBy(Product::getManufacturer, Collectors.counting()));
		
		int i = 0;
		for (Object groupName : group.keySet() ) {
			i++;
			System.out.println(i + " >> ");
			System.out.println("Group Name: " + groupName);
			System.out.println("Products: " + group.get(groupName));
			System.out.println("-----------------------------------------");
		}
		
		System.out.println("<2> Calculate the total number of products in each group");
		Map calculateGroup = products.stream()
								   .collect(Collectors.groupingBy(Product::getManufacturer,Collectors.summingInt(Product::getTotal)));
		
		i = 0;
		for (Object groupName : calculateGroup.keySet() ) {
			i++;
			System.out.println(i + " >> ");
			System.out.println("Group Name: " + groupName);
			System.out.println("Total Numbers of products 'total/getTotal' : " + calculateGroup.get(groupName));
			System.out.println("-----------------------------------------");
		}
	}
}
