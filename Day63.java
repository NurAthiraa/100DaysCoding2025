import java.util.Scanner;

public class Day63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan batas angka (N): ");
        int n = sc.nextInt();

        int total = 1;

        for (int i = 1; i <= n; i++) {
            total = total * i;
        }

        System.out.println("Total perkalian dari 1 sampai " + n + " adalah: " + total);
    }
}
