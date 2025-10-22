import java.util.Scanner;

public class Day45IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka (1-7): ");
        int angka = sc.nextInt();

        if (angka == 1) {
            System.out.println("Sekarang adalah hari Senin");
        } else if (angka == 2) {
            System.out.println("Sekarang adalah hari Selasa");
        } else if (angka == 3) {
            System.out.println("Sekarang adalah hari Rabu");
        } else if (angka == 4) {
            System.out.println("Sekarang adalah hari Kamis");
        } else if (angka == 5) {
            System.out.println("Sekarang adalah hari Jumat");
        } else if (angka == 6) {
            System.out.println("Sekarang adalah hari Sabtu");
        } else if (angka == 7) {
            System.out.println("Sekarang adalah hari Minggu");
        } else {
            System.out.println("Jumlah hari hanya 7");
        }

        sc.close();
    }
}
