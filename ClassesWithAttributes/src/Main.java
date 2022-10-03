
public class Main {

	public static void main(String[] args) {
	
		Product product = new Product(1,"Laptop","Asus Laptop",10000, 8,"white", "l123");
		product.set_name("Laptop");
		product.setId(2);
		product.set_description("Asus Laptop");
	    product.set_price(10000);
	    product.set_stockAmount(7); 
	    ProductManager productmanager = new ProductManager();
		 productmanager.add(product);
		 System.out.println(product.get_kod());
	}
}