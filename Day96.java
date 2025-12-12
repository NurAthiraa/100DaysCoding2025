import java.util.Scanner;

public class Day96 {

    public int tambah(int a, int b) {
        return a + b;
    }

    public int kurang(int a, int b) {
        return a - b;
    }

    public int kali(int a, int b) {
        return a * b;
    }

    public double bagi(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Pembagian dengan 0 tidak diperbolehkan!");
            return 0;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Day96 kalk = new Day96();

        System.out.print("Masukkan Angka 1: ");
        int angka1 = sc.nextInt();

        System.out.print("Masukkan Angka 2: ");
        int angka2 = sc.nextInt();

        int hasilTambah = kalk.tambah(angka1, angka2);
        int hasilKurang = kalk.kurang(angka1, angka2);
        int hasilKali = kalk.kali(angka1, angka2);
        double hasilBagi = kalk.bagi(angka1, angka2);

        System.out.println("\n--- Hasil Operasi ---");
        System.out.println("Penjumlahan : " + hasilTambah);
        System.out.println("Pengurangan : " + hasilKurang);
        System.out.println("Perkalian   : " + hasilKali);
        System.out.println("Pembagian   : " + hasilBagi);

        sc.close();
    }
}
