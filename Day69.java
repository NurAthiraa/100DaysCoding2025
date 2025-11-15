import java.util.Scanner;

public class evaluasiTerakhir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        int totalBelanja = 0;
        int uangBayar;
        int kembalian;

        do {
            System.out.println("=== Selamat Datang di Warung Sederhana! ===");
            System.out.println("Menu Makanan:");
            System.out.println("1. Nasi Goreng   (Rp 15.000)");
            System.out.println("2. Mie Ayam      (Rp 12.000)");
            System.out.println("3. Bakso         (Rp 10.000)");
            System.out.println("4. Es Teh Manis  (Rp 5.000)");
            System.out.println("----------------------------------");
            System.out.println("0. Selesai & Bayar");
            System.out.println();
            System.out.println("Total Belanja Saat Ini: Rp " + totalBelanja);
            System.out.print("Masukkan pilihan Anda (0-4): ");
            if (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("Input tidak valid. Masukkan angka 0-4.");
                System.out.println();
                pilihan = -1;
                continue;
            }
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    totalBelanja += 15000;
                    System.out.println("Menambahkan Nasi Goreng...");
                    break;
                case 2:
                    totalBelanja += 12000;
                    System.out.println("Menambahkan Mie Ayam...");
                    break;
                case 3:
                    totalBelanja += 10000;
                    System.out.println("Menambahkan Bakso...");
                    break;
                case 4:
                    totalBelanja += 5000;
                    System.out.println("Menambahkan Es Teh Manis...");
                    break;
                case 0:
                    System.out.println("Proses pemesanan selesai. Menghitung total...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }

            System.out.println();

        } while (pilihan != 0);
        System.out.println("==============================");
        System.out.println("TOTAL YANG HARUS DIBAYAR: Rp " + totalBelanja);
        System.out.print("Masukkan Uang Anda: Rp ");

        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.print("Masukkan angka yang valid untuk uang: Rp ");
        }
        uangBayar = sc.nextInt();

        while (uangBayar < totalBelanja) {
            int kurang = totalBelanja - uangBayar;
            System.out.println("Maaf, uang Anda kurang Rp " + kurang);
            System.out.print("Silakan masukkan jumlah uang yang cukup: Rp ");
            while (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.print("Masukkan angka yang valid untuk uang: Rp ");
            }
            uangBayar = sc.nextInt();
        }
        kembalian = uangBayar - totalBelanja;
        System.out.println();
        System.out.println("=== STRUK PEMBAYARAN ===");
        System.out.println("Total Belanja : Rp " + totalBelanja);
        System.out.println("Uang Bayar    : Rp " + uangBayar);
        System.out.println("Kembalian     : Rp " + kembalian);
        System.out.println("------------------------");
        System.out.println("Terima kasih telah berbelanja!");

        sc.close();
    }
}
