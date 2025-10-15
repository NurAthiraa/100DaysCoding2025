import java.util.Scanner;

public class Day38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Meminta pengguna untuk memasukkan angka
        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();
        
        // Menentukan apakah angka positif, negatif, atau nol
        if (angka > 0) {
            System.out.println(angka + " adalah bilangan positif");
        } else if (angka < 0) {
            System.out.println(angka + " adalah bilangan negatif");
        } else {
            System.out.println("Bilangan tersebut adalah nol");
        }
        
        // Menutup scanner
        sc.close();
    }
}
