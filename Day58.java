import java.util.Scanner;

public class Day58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka (N): ");
        int n = sc.nextInt();

        System.out.println("\nDeret Naik:");
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        System.out.println("\nDeret Turun:");
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }

        sc.close();
    }
}
