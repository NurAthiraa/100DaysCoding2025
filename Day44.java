import java.util.Scanner;

public class Day44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Program Predikat Nilai Mahasiswa ===");
        System.out.print("Masukkan Nama Mahasiswa : ");
        String nama = sc.nextLine();

        System.out.print("Masukkan Nama Mata Kuliah : ");
        String mataKuliah = sc.nextLine();

        System.out.print("Masukkan Nilai (0 - 100): ");
        double nilai = sc.nextDouble();

        String predikat;

        if (nilai > 90 && nilai <= 100) {
            predikat = "A";
        } else if (nilai > 80 && nilai <= 90) {
            predikat = "B";
        } else if (nilai > 70 && nilai <= 80) {
            predikat = "C";
        } else if (nilai > 60 && nilai <= 70) {
            predikat = "D";
        } else {
            predikat = "E";
        }

        System.out.println();
        System.out.println("=== Hasil Pembelajaran Selama 1 Semester ===");
        System.out.println("Nama : " + nama);
        System.out.println("Pada mata kuliah " + mataKuliah + ", " + nama + " telah mendapat nilai " + predikat);

        sc.close();
    }
}
