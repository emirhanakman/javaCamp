package oopIntro;

public class Product {
	//encapsul
	int id; // ürünlerin benzersiz identity deðeri. Veritabanýnda kayýtlý olan
	String name; // ürün adi
	double unitPrice; //birim fiyati
	String detail; // ürün detayi
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
