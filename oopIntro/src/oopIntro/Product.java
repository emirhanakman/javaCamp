package oopIntro;

public class Product {
	
	public Product() { //constructor yap�c� blok 
		System.out.println("Ben �al��t�m");
		
	}
	public Product(int id, String name, double unitPrice, String detail) { // overloading birden fazla metot. a��r� y�kleme
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}
	int id; // �r�nlerin benzersiz identity de�eri. Veritaban�nda kay�tl� olan
	String name; // �r�n adi
	double unitPrice; //birim fiyati
	String detail; // �r�n detayi
	
}
