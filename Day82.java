import java.util.Scanner;

public class day82 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("========== BUKU TAMU ==========");
        System.out.print("Berapa tamu yang ingin dicatat? ");

        int jumlah = input.nextInt();
        input.nextLine();

        String[] tamu = new String[jumlah];

        System.out.println("\n===== Input Nama =====");

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Nama tamu ke-" + (i + 1) + ": ");
            tamu[i] = input.nextLine();
        }

        System.out.println("\n===== Daftar Tamu =====");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i + 1) + ". " + tamu[i]);
        }

        System.out.println("================================");
    }
}
