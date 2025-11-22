import java.util.Scanner;

public class Day76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan Username: ");
            String username = sc.nextLine();

            if (username.equalsIgnoreCase("EXIT")) {
                System.out.println("Program berhenti...");
                break;
            }

            System.out.print("Masukkan Komentar: ");
            String komentar = sc.nextLine();

            if (username.isEmpty() || komentar.isEmpty()) {
                System.out.println("Data tidak boleh kosong!");
                System.out.println();
                continue;
            }

            if (username.equalsIgnoreCase("joker")) {
                System.out.println("User ini telah dibanned.");
                System.out.println();
                continue;
            }

            String lowerKomentar = komentar.toLowerCase();
            if (lowerKomentar.contains("kasar") ||
                lowerKomentar.contains("bodoh") ||
                lowerKomentar.contains("promo")) 
            {
                System.out.println("Komentar mengandung konten terlarang!");
                System.out.println();
                continue;
            }

            System.out.println("Komentar berhasil dipublikasikan!");
            System.out.println();
        }

        sc.close();
    }
}
