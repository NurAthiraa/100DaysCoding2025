import java.util.Scanner;

public class day34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Seleksi Anggota Klub Esports ===");
        System.out.print("Masukkan nilai tes Anda: ");
        double nilaiTes = sc.nextDouble();

        System.out.print("Masukkan jam latihan per minggu: ");
        int jamLatihan = sc.nextInt();

        System.out.print("Apakah Anda punya sertifikat turnamen? (true/false): ");
        boolean sertifikat = sc.nextBoolean();

        System.out.print("Masukkan ranking Anda (semakin kecil semakin bagus): ");
        int ranking = sc.nextInt();

        System.out.print("Apakah Anda rajin berlatih? (true/false): ");
        boolean rajin = sc.nextBoolean();

        boolean syaratUtama = (nilaiTes >= 80) && (jamLatihan >= 5);
        boolean syaratTambahan = sertifikat || (ranking <= 1000);
        boolean lolos = (syaratUtama && syaratTambahan) && rajin;
        boolean gagal = !lolos;

        System.out.println("\n================= HASIL PENILAIAN =================");
        System.out.printf(" Nilai Tes & Latihan Memadai   : %b%n", syaratUtama);
        System.out.printf(" Prestasi Tambahan Terpenuhi   : %b%n", syaratTambahan);
        System.out.printf(" Rajin Berlatih                : %b%n", rajin);
        System.out.println("---------------------------------------------------");
        System.out.printf(" Status Lolos Seleksi          : %b%n", lolos);
        System.out.printf(" Status Tidak Lolos            : %b%n", gagal);
        System.out.println("===================================================");
        System.out.println("Terima kasih telah mengikuti seleksi! ");
    }
}
