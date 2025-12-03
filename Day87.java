import java.util.Scanner;

public class Day87 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] buku = {
            "Harry Potter",
            "Lord of the Rings",
            "Alchemist",
            "Sherlock Holmes",
            "Hobbit"
        };

        System.out.println("--- Cari Buku ---");
        System.out.print("Masukkan judul buku: ");
        String cari = input.nextLine();

        int indexKetemu = -1;

        for (int i = 0; i < buku.length; i++) {
            if (buku[i].equalsIgnoreCase(cari)) {
                indexKetemu = i;
                break;
            }
        }

        System.out.println();

        if (indexKetemu != -1) {
            System.out.println(
                "Hasil: Buku '" + buku[indexKetemu] +
                "' ditemukan di indeks ke-" + indexKetemu +
                " (Tumpukan ke-" + (indexKetemu + 1) + ")."
            );
        } else {
            System.out.println("Hasil: Maaf, buku tidak ada di tumpukan.");
        }
    }
}
