import java.util.Scanner;
public class Day28 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan angka pertama: ");
            int a = scanner.nextInt();

            System.out.print("Masukkan angka kedua: ");
            int b = scanner.nextInt();

            scanner.close();

            boolean sama = (a == b);
            boolean tidakSama = (a != b);

            System.out.printf("Apakah %d sama dengan %d? %b%n", a, b, sama);
            System.out.printf("Apakah %d tidak sama dengan %d? %b%n", a, b, tidakSama);
        }
    }

