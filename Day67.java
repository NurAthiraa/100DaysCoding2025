import java.util.Scanner;

public class Day67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Pola Garis Horizontal ===");
        System.out.print("Masukkan jumlah N: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.print("* ");
        }
    }
}
