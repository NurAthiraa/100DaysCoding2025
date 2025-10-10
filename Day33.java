import java.util.Scanner;

public class Day33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Cek Kelayakan Masuk Area VIP ===");
        System.out.print("Masukkan umur kamu: ");
        int umur = sc.nextInt();

        System.out.print("Apakah kamu punya kartu VIP? (true/false): ");
        boolean vip = sc.nextBoolean();

        boolean bolehMasuk = (umur >= 18) && vip;

        if (!bolehMasuk) {
            System.out.println("Maaf, kamu belum memenuhi syarat untuk masuk ke area VIP.");
        } else {
            System.out.println("Selamat datang di area VIP!");
        }

        sc.close();
    }
}
