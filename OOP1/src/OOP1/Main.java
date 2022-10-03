package OOP1;

public class Main {

public static void main(String[] args) {
		// set value
	Product product1 = new Product();
	product1.name="Deloghi kahve makinesi";
	product1.unitPrice= 7500;
	product1.discount= 7;
	product1.unitsInStock= 3;
	product1.imgUrl= "kahvemakinesi.jpg";
	// get 
	// System.out.println(product1.name);
	
	Product product2 = new Product();
	product2.name="Smeg kahve makinesi";
	product2.unitPrice= 6500;
	product2.discount= 8;
	product2.unitsInStock= 2;
	product2.imgUrl= "kahvemakinesi2.jpg";
	
	
	Product product3 = new Product();
	product3.name="Kitchen kahve makinesi";
	product3.unitPrice= 7500;
	product3.discount= 9;
	product3.unitsInStock= 4;
	product3.imgUrl= "kahvemakinesi3.jpg";
	
	Product[] products = {product1, product2, product3};
	for(Product product : products) {
		System.out.println(product.name);
	}}}3