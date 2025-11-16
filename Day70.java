import java.util.Scanner;

public class Day70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Pola Persegi Panjang ===");
        System.out.print("Masukkan panjang (P): ");
        int P = sc.nextInt();

        System.out.print("Masukkan lebar (L): ");
        int L = sc.nextInt();

        for (int i = 0; i < P; i++) {
            for (int j = 0; j < L; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
