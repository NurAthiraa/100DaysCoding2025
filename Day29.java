import java.util.Scanner;

public class Day29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Program Pengecekan Keamanan Wahana Permainan ===");
        System.out.print("Masukkan tinggi badan Anda (cm): ");
        double tinggi = sc.nextDouble();

        System.out.print("Masukkan berat badan Anda (kg): ");
        double berat = sc.nextDouble();

        System.out.println("\n=== Data Pengunjung ===");
        System.out.println("Tinggi badan Anda: " + tinggi + " cm");
        System.out.println("Berat badan Anda : " + berat + " kg");

        boolean memenuhiTinggi = tinggi > 150;
        boolean memenuhiBerat = berat < 80;

        System.out.println("\n=== Hasil Pengecekan Aturan Keamanan ===");

        if (memenuhiTinggi) {
            System.out.println("- Tinggi badan Anda memenuhi syarat (lebih dari 150 cm).");
        } else {
            System.out.println("- Tinggi badan Anda tidak memenuhi syarat (harus lebih dari 150 cm).");
        }

        if (memenuhiBerat) {
            System.out.println("- Berat badan Anda memenuhi syarat (kurang dari 80 kg).");
        } else {
            System.out.println("- Berat badan Anda tidak memenuhi syarat (harus kurang dari 80 kg).");
        }

        System.out.println("\n=== Keputusan Akhir ===");

        if (memenuhiTinggi && memenuhiBerat) {
            System.out.println("Selamat! Anda diperbolehkan naik wahana permainan ini.");
        } else {
            System.out.println("Mohon maaf, Anda tidak diperbolehkan naik wahana permainan ini demi keamanan Anda.");
        }

        sc.close();
    }
}
