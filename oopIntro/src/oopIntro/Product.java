package oopIntro;

public class Product {
	//encapsul
	int id; // �r�nlerin benzersiz identity de�eri. Veritaban�nda kay�tl� olan
	String name; // �r�n adi
	double unitPrice; //birim fiyati
	String detail; // �r�n detayi
	double discount;
	double unitPriceDiscoung;
	public Product() {
		
	}
	public Product(int id, String name, double unitPrice, String detail, double discount) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		this.discount = discount;
		}
}
