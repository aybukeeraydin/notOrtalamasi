import java.util.Scanner;

public class notOrtHesaplama {

	public static void main(String[] args) {
		//Matematik, Fizik, Kimya, T�rk�e, Tarih, M�zik derslerinin s�nav puanlar�n� kullan�c�dan alan ve ortalamalar�n� 
		//hesaplay�p ekrana bast�r�lan program� yaz�n.

		Scanner girdi = new Scanner(System.in);
		System.out.println("Matematik notunuzu giriniz: ");
		int mat = girdi.nextInt();
		System.out.println("Fizik notunuzu giriniz: ");
		int fiz = girdi.nextInt();
		System.out.println("Kimya notunuzu giriniz: ");
		int kim = girdi.nextInt();
		System.out.println("T�rk�e notunuzu giriniz: ");
		int tr = girdi.nextInt();
		System.out.println("Tarih notunuzu giriniz: ");
		int tar = girdi.nextInt();
		System.out.println("M�zik notunuzu giriniz: ");
		int muz = girdi.nextInt();
	
		double ort = (mat+kim+fiz+tr+tar+muz)/6;
		System.out.println("Ortalaman�z: " + ort);
		
		System.out.println(ort>=60 ? "SINIFI GE�T�N�Z!" : "SINIFI GE�EMED�N�Z!");
		
		

	}

}
