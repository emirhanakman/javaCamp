package intro;

public class Main {

	public static void main(String[] args) {
		//camelCase
		// don't repeat yourself
		// TODO Auto-generated method stub
		System.out.println("Merhaba");
		String internetSubeButonu="?nternet ?ubesi";
		System.out.println(internetSubeButonu);
		double dolarDun = 8.16;
		double dolarBugun = 8.16;
		int vade=36;
		boolean dustuMu = true;
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar D??t?");
		}
		else if(dolarBugun>dolarDun) {
			System.out.println("Dolar Y?kseldi");
		}
		else {
			System.out.println("Dolar E?ittir");
		}
		
		//------------------------------
		String kredi1="H?zl? Kredi";
		String kredi2="Mutlu emekli kredisi";
		String kredi3="Konut kredisi";
		String kredi4="?ift?i kredisi";
		String kredi5="Msb kredisi";
		String kredi6="MEb kredisi";
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);
		//-----------------------------------
		String[] krediler = 
			{
					"H?zl? Kredi",
					"Mutlu Emekli Kredisi",
					"Konut Kredisi",
					"?ift?i Kredisi",
					"MSB Kredisi",
					"Meb Kredisi"
			};
		// foreach d?ng?s?
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		//-----------
		for (int i =0; i<krediler.length; i++)
		{
			System.out.println("------------");
			System.out.println(krediler[i]);
		}
		//21.04.2021
	}

}
