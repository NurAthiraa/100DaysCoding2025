import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;

        System.out.println("=== SELAMAT DATANG DI KAFE JAVA ===");
        System.out.println("1. Minuman");
        System.out.println("2. Makanan");
        System.out.println("3. Paket Hemat");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu (1-4): ");
        pilihan = sc.nextInt();

        System.out.println("---------------------------------");

        if (pilihan == 1) {
            System.out.println("=== MENU MINUMAN ===");
            System.out.println("1. Kopi Hitam - Rp10.000");
            System.out.println("2. Es Teh Manis - Rp5.000");
            System.out.println("3. Jus Alpukat - Rp12.000");
            System.out.print("Pilih minuman (1-3): ");
            int minuman = sc.nextInt();

            if (minuman == 1) {
                System.out.println("Kamu memilih Kopi Hitam ");
            } else if (minuman == 2) {
                System.out.println("Kamu memilih Es Teh Manis ");
            } else if (minuman == 3) {
                System.out.println("Kamu memilih Jus Alpukat ");
            } else {
                System.out.println("Pilihan tidak valid!");
            }

        } else if (pilihan == 2) {
            System.out.println("=== MENU MAKANAN ===");
            System.out.println("1. Nasi Goreng - Rp15.000");
            System.out.println("2. Mie Ayam - Rp12.000");
            System.out.println("3. Soto Ayam - Rp13.000");
            System.out.print("Pilih makanan (1-3): ");
            int makanan = sc.nextInt();

            if (makanan == 1) {
                System.out.println("Kamu memilih Nasi Goreng ");
            } else if (makanan == 2) {
                System.out.println("Kamu memilih Mie Ayam ");
            } else if (makanan == 3) {
                System.out.println("Kamu memilih Soto Ayam ");
            } else {
                System.out.println("Pilihan tidak valid!");
            }

        } else if (pilihan == 3) {
            System.out.println("=== PAKET HEMAT ===");
            System.out.println("1. Nasi Goreng + Es Teh - Rp18.000");
            System.out.println("2. Mie Ayam + Kopi Hitam - Rp20.000");
            System.out.println("3. Soto Ayam + Jus Alpukat - Rp23.000");
            System.out.print("Pilih paket (1-3): ");
            int paket = sc.nextInt();

            if (paket == 1) {
                System.out.println("Kamu memilih Paket Nasi Goreng + Es Teh ");
            } else if (paket == 2) {
                System.out.println("Kamu memilih Paket Mie Ayam + Kopi Hitam ");
            } else if (paket == 3) {
                System.out.println("Kamu memilih Paket Soto Ayam + Jus Alpukat ");
            } else {
                System.out.println("Pilihan tidak valid!");
            }

        } else if (pilihan == 4) {
            System.out.println("Terima kasih sudah berkunjung di Kafe Java! ");
        } else {
            System.out.println("Pilihan tidak tersedia. Silakan coba lagi!");
        }

        sc.close();
    }
}
