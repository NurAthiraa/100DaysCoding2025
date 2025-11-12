import java.util.Scanner;

public class Day66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = sc.nextInt();

        System.out.println("=== Hasil Pola Vertikal ===");
        for (int i = 1; i <= N; i++) {
            System.out.println("*");
        }

        sc.close();
    }
}
