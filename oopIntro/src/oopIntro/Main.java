package oopIntro;

public class Main {

	public static void main(String[] args) {	
		// TODO Auto-generated method stub
		/*String[] products = {
				"Lenovo V14",
				"Lenovo V15",
				"Hp 5"
				
		};*/
		Product product1 = new Product();	 // referans olu�turma,intance
		product1.id=1;
		product1.name="Lenovo V14";
		product1.unitPrice=15000;
		product1.detail="16 GB RAM";
		Product[] products = {product1};
		System.out.println(products.length);
		
	}

}
