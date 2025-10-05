package Pekan4;
import java.util.Scanner;
public class SistemPembelianTiketBioskop {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Masukkan Nama Pembeli: ");
	        String nama = input.nextLine();

	        System.out.print("Masukkan Jumlah Tiket: ");
	        int jumlah = input.nextInt();

	        System.out.print("Pilih Hari (1=Senin-Kamis, 2=Jumat, 3=Sabtu-Minggu): ");
	        int hari = input.nextInt();

	        System.out.print("Pilih Waktu Tayang (1=Pagi, 2=Siang, 3=Malam): ");
	        int waktu = input.nextInt();

	        System.out.print("Pilih Jenis Studio (1=Regular, 2=Deluxe, 3=Premium): ");
	        int studio = input.nextInt();

	        int hargaDasar = 0;
	        String namaStudio = "";
	        switch (studio) {
	            case 1: hargaDasar = 30000; namaStudio = "Regular"; break;
	            case 2: hargaDasar = 50000; namaStudio = "Deluxe"; break;
	            case 3: hargaDasar = 75000; namaStudio = "Premium"; break;
	            default: System.out.println("Input studio salah!"); return;
	        }

	        double biayaHari = 0, biayaWaktu = 0;
	        String namaHari = "", namaWaktu = "";

	        if (hari == 1) { biayaHari = 0; namaHari = "Senin-Kamis"; }
	        else if (hari == 2) { biayaHari = 0.1; namaHari = "Jumat"; }
	        else if (hari == 3) { biayaHari = 0.3; namaHari = "Sabtu-Minggu"; }
	        else { System.out.println("Input hari salah!"); return; }

	        if (waktu == 1) { biayaWaktu = 0; namaWaktu = "Pagi"; }
	        else if (waktu == 2) { biayaWaktu = 0.1; namaWaktu = "Siang"; }
	        else if (waktu == 3) { biayaWaktu = 0.2; namaWaktu = "Malam"; }
	        else { System.out.println("Input waktu salah!"); return; } 
	        
	        
	        double hargaPerTiket = hargaDasar + (hargaDasar * biayaHari) + (hargaDasar * biayaWaktu);
	        double subtotal = hargaPerTiket * jumlah;
	        double diskon = (jumlah >= 5) ? subtotal * 0.2 : 0;
	        double total = subtotal - diskon;

	        System.out.println("\n===== PEMBELIAN TIKET BIOSKOP =====");
	        System.out.println("Nama Pembeli   : " + nama);
	        System.out.println("Jumlah Tiket   : " + jumlah);
	        System.out.println("Hari           : " + namaHari);
	        System.out.println("Waktu Tayang   : " + namaWaktu);
	        System.out.println("Jenis Studio   : " + namaStudio);
	        System.out.println("-----------------------------------");
	        System.out.println("Harga Dasar    : Rp " + hargaDasar);
	        System.out.println("Biaya Hari     : +" + (biayaHari*100) + "%");
	        System.out.println("Biaya Waktu    : +" + (biayaWaktu*100) + "%");
	        System.out.println("Harga per Tiket: Rp " + (int)hargaPerTiket);
	        System.out.println("Subtotal       : Rp " + (int)subtotal);
	        System.out.println("Diskon         : Rp " + (int)diskon);
	        System.out.println("-----------------------------------");
	        System.out.println("TOTAL BAYAR    : Rp " + (int)total);
	        input.close(); //
	    }
	}


