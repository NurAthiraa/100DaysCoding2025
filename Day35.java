import java.util.Scanner;

public class Day35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai ujian: ");
        int nilai = sc.nextInt();

        if (nilai >= 90) {
            System.out.println("Selamat! Kamu mendapat nilai A.");
        } else if (nilai >= 75) {
            System.out.println("Bagus! Kamu mendapat nilai B.");
        } else if (nilai >= 60) {
            System.out.println("Cukup baik, kamu mendapat nilai C.");
        } else {
            System.out.println("Sayang sekali, kamu belum lulus.");
        }

        sc.close();
    }
}
