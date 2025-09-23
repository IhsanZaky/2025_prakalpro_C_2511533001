package Pekan3;
 import java.util.Scanner;
public class OperatorAritmatika {

	public static void main(String[] args) {
	int A1;
	int A2;
	int hasil;
	Scanner keyboard = new Scanner(System.in);
	System.out.print("Input angka-1: ");
	A1 = keyboard.nextInt();
	System.out.print("Input angka-2: ");
	A2 = keyboard.nextInt();
	keyboard.close();
	System.out.print ("operator Penjumlahan");
	hasil = A1 + A2;//penjumlahan
	System.out.print("Hasil = " + hasil);
	System.out.print("operator Pengurangan");
	hasil = A1 - A2;//pengurangan
	System.out.print("Hasil = " + hasil);
	System.out.print("operator Perkalian");
	hasil = A1 * A2;//perkalian
	System.out.print("Hasil = " + hasil);
	System.out.print("operator hasil bagi");
	hasil = A1 / A2;//pembagian
	System.out.print("Hasil = " + hasil);
	System.out.print("operator sisa bagi");
	hasil = A1 % A2;//Sisa Bagi
	System.out.print("Hasil = " + hasil);
	
	
	}

}
