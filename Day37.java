import java.util.Scanner;

public class Day37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();

        String hasil = (angka % 2 == 0) ? "Bilangan Genap" : "Bilangan Ganjil";
        System.out.println(angka + " adalah " + hasil);

        sc.close();
    }
}
