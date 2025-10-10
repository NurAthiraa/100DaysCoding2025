import java.util.Scanner;

public class Day33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Program Cek Kelayakan Masuk Area VIP ===");
        System.out.print("Masukkan umur kamu: ");
        int umur = sc.nextInt();

        System.out.print("Apakah kamu punya kartu VIP? (true/false): ");
        boolean vip = sc.nextBoolean();

        boolean bolehMasuk = (umur >= 18) && vip;

        System.out.println("Status boleh masuk: " + bolehMasuk);
        System.out.println("Kebalikannya (hasil dari !bolehMasuk): " + !bolehMasuk);

        sc.close();
    }
}
