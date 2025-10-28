import java.util.Scanner;

public class Day51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Program Tabel Perkalian ===");
        System.out.print("Masukkan batas angka: ");
        int n = sc.nextInt();

        System.out.print("Masukkan angka yang ingin dikalikan: ");
        int angka = sc.nextInt();

        System.out.println("\nTabel perkalian " + angka + " sampai " + n + ":");

        for (int i = 1; i <= n; i++) {
            System.out.println(i + " x " + angka + " = " + (i * angka));
        }

        sc.close();
    }
}
