import java.util.Scanner;

public class Day61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan batas angka (N): ");
        int N = sc.nextInt();

        System.out.print("Masukkan angka kelipatan (M): ");
        int M = sc.nextInt();

        System.out.print("Kelipatan " + M + " antara 1 dan " + N + ": ");

        for (int i = 1; i <= N; i++) {
            if (i % M == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
