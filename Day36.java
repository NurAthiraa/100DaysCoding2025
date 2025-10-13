import java.util.Scanner;

public class Day36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Apakah memiliki kartu akses? (true/false): ");
        boolean kartuAkses = sc.nextBoolean();

        if (kartuAkses) {
            System.out.print("Apakah sedang dalam jadwal piket? (true/false): ");
            boolean jadwalPiket = sc.nextBoolean();

            if (jadwalPiket) {
                System.out.print("Masukkan kode PIN: ");
                int pin = sc.nextInt();

                if (pin == 1234) {
                    System.out.println("Akses diterima! Selamat datang di ruang server utama.");
                } else {
                    System.out.println("PIN salah! Akses ditolak.");
                }

            } else {
                System.out.println("Kamu tidak dalam jadwal piket hari ini. Akses ditolak.");
            }

        } else {
            System.out.println("Kartu akses tidak valid. Akses ditolak.");
        }

        sc.close();
    }
}
