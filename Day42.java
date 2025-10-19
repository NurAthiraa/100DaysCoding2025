import java.util.Scanner;

public class Day42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan gaji kotor bulanan: ");
        double gajiKotor = sc.nextDouble();

        double pajak = gajiKotor * 0.05;
        double gajiBersih = gajiKotor - pajak;

        System.out.println("\n===== Rincian Gaji Karyawan =====");
        System.out.printf("Gaji Kotor : Rp%.2f%n", gajiKotor);
        System.out.printf("Pajak (5%%) : Rp%.2f%n", pajak);
        System.out.printf("Gaji Bersih: Rp%.2f%n", gajiBersih);

        sc.close();
    }
}
