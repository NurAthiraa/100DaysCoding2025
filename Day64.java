import java.util.Scanner;

public class Day64 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Hitung Pangkat M^N ===");
        System.out.print("Masukkan angka basis (M): ");
        int M = input.nextInt();

        System.out.print("Masukkan angka pangkat (N): ");
        int N = input.nextInt();

        int hasil = 1;

        for (int i = 1; i <= N; i++) {
            hasil = hasil * M;
        }

        System.out.println("Hasil dari " + M + " pangkat " + N + " adalah: " + hasil);
    }
}
