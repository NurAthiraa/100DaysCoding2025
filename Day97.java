import java.util.Scanner;

public class Day97 {

    public static int hitungLuasPersegi(int sisi) {
        return sisi * sisi;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Program Hitung Luas Persegi ---");
        System.out.print("Masukkan panjang sisi: ");
        int sisi = input.nextInt();

        int luas = hitungLuasPersegi(sisi);

        System.out.println("\nLuas Persegi dengan sisi " + sisi + " adalah: " + luas);
    }
}

