import java.util.Scanner;

public class notOrtHesaplama {

	public static void main(String[] args) {
		//Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sýnav puanlarýný kullanýcýdan alan ve ortalamalarýný 
		//hesaplayýp ekrana bastýrýlan programý yazýn.

		Scanner girdi = new Scanner(System.in);
		System.out.println("Matematik notunuzu giriniz: ");
		int mat = girdi.nextInt();
		System.out.println("Fizik notunuzu giriniz: ");
		int fiz = girdi.nextInt();
		System.out.println("Kimya notunuzu giriniz: ");
		int kim = girdi.nextInt();
		System.out.println("Türkçe notunuzu giriniz: ");
		int tr = girdi.nextInt();
		System.out.println("Tarih notunuzu giriniz: ");
		int tar = girdi.nextInt();
		System.out.println("Müzik notunuzu giriniz: ");
		int muz = girdi.nextInt();
	
		double ort = (mat+kim+fiz+tr+tar+muz)/6;
		System.out.println("Ortalamanýz: " + ort);
		
		System.out.println(ort>=60 ? "SINIFI GEÇTÝNÝZ!" : "SINIFI GEÇEMEDÝNÝZ!");
		
		

	}

}
