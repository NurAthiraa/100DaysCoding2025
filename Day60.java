import java.util.Scanner;

public class Day60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan batas angka (N): ");
        int N = sc.nextInt();

        System.out.print("Angka Ganjil (N-1): ");
        for (int i = N - 1; i >= 1; i--) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        System.out.print("Angka Genap (N-1): ");
        for (int i = N; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
