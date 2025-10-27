import java.util.Scanner;

public class Day50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();
        String hasil = (angka % 2 == 0) ? "Angka tersebut adalah GENAP" : "Angka tersebut adalah GANJIL";
        System.out.println(hasil);
        sc.close();
    }
}
