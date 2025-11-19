import java.util.Scanner;

public class Day73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Program Penjumlahan ===");
        System.out.println("(Input negatif untuk berhenti)");

        int total = 0;

        while (true) {
            System.out.print("Masukkan angka: ");
            int angka = sc.nextInt();

            if (angka < 0) {
                System.out.println("\nPerulangan berhenti.");
                break;
            }
            total += angka;
        }

        System.out.println("Total penjumlahan: " + total);
    }
}
