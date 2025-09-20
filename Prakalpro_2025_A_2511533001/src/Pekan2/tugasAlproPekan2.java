package pekan2;

public class tugasAlproPekan2 {

	public static void main(String[] args) {
		       // Deklarasi variabel
		        int umur = 22;                        // tipe data int, untuk menyimpan umur
		        float jamTidurAktual = 6.5f;          // tipe data float, untuk menyimpan jam tidur aktual
		        String kategoriUmur;                  // tipe data String, untuk menyimpan kategori umur tanpa singkatan
		        boolean cukupTidur;                   // tipe data boolean, untuk menyimpan kondisi apakah tidur cukup atau tidak

		        float jamTidurDibutuhkan;

		        // Menentukan kebutuhan tidur berdasarkan umur
		        if (umur == 17) {
		            kategoriUmur = "Teenager";        // kategori Teenager untuk umur 17 tahun
		            jamTidurDibutuhkan = 8.5f;        // kebutuhan tidur 8.5 jam
		        } else if (umur >= 18 && umur <= 25) {
		            kategoriUmur = "Young Adult";     // kategori Young Adult untuk umur 18 sampai 25 tahun
		            jamTidurDibutuhkan = 8.0f;        // kebutuhan tidur 8 jam
		        } else if (umur >= 26 && umur <= 30) {
		            kategoriUmur = "Adult";           // kategori Adult untuk umur 26 sampai 30 tahun
		            jamTidurDibutuhkan = 7.5f;        // kebutuhan tidur 7.5 jam
		        } else {
		            kategoriUmur = "Di Luar Rentang"; // kategori untuk umur di luar 17 sampai 30 tahun
		            jamTidurDibutuhkan = 8.0f;        // kebutuhan tidur default
		        }

		        // Menentukan apakah tidur aktual sudah cukup
		        cukupTidur = jamTidurAktual >= jamTidurDibutuhkan;

		        // Menampilkan hasil ke layar
		        System.out.println("=== Rekomendasi Waktu Tidur ===");
		        System.out.printf("Umur                 : %d tahun%n", umur);
		        System.out.printf("Kategori Umur        : %s%n", kategoriUmur);
		        System.out.printf("Jam Tidur Dibutuhkan : %.1f jam%n", jamTidurDibutuhkan);
		        System.out.printf("Jam Tidur Aktual     : %.1f jam%n", jamTidurAktual);
		        System.out.printf("Cukup Tidur?         : %b%n", cukupTidur);

		        // Memberikan saran
		        if (!cukupTidur) {
		            float kurangTidur = jamTidurDibutuhkan - jamTidurAktual;
		            System.out.printf("Saran: Anda perlu menambah tidur sekitar %.1f jam lagi.%n", kurangTidur);
		        } else {
		            System.out.println("Bagus! Waktu tidur Anda sudah mencukupi kebutuhan.");
		        }
		    }
		}
