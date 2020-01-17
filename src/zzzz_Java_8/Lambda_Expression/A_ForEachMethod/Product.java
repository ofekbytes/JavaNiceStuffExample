package zzzz_Java_8.Lambda_Expression.A_ForEachMethod;

public class Product {

	private String id;
	private String name;
	private long price;
	private int quantity;
	private String manufacturer;
	
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}


	//constructor 
	public Product() {	
	}

	//constructor + fields
	public Product(String id, String name, long price, int quantity, String manufacturer) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.manufacturer = manufacturer;
	}
	
	
	public String toString() {
		return " id: " + this.id 
			+ "  name: " + this.name 
			+ "  price: " + this.price 
			+ "  quantity: " + this.quantity 
			+ "  manufacturer: " + this.manufacturer;
	}

}
