import java.util.Scanner;
import java.util.Random;

public class Day52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int angkaRahasia = rand.nextInt(10) + 1;
        int tebakan;
        int percobaan = 0;

        System.out.println("=== Permainan Tebak Angka ===");
        System.out.println("Saya sudah memilih angka rahasia antara 1 - 10");
        System.out.println("Coba tebak ya!\n");

        System.out.print("Masukkan tebakanmu: ");
        tebakan = sc.nextInt();

        while (tebakan != angkaRahasia) {
            percobaan++;
            if (tebakan < angkaRahasia) {
                System.out.println("Terlalu kecil! Coba lagi...");
            } else {
                System.out.println("Terlalu besar! Coba lagi...");
            }
            System.out.print("Masukkan tebakanmu: ");
            tebakan = sc.nextInt();
        }

        percobaan++;
        System.out.println("\nSelamat, tebakan kamu benar!");
        System.out.println("Angka rahasianya adalah: " + angkaRahasia);
        System.out.println("Jumlah percobaan: " + percobaan + " kali");

        sc.close();
    }
}
