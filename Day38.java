import java.util.Scanner;

public class Day38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();
        
        if (angka > 0) {
            System.out.println(angka + " adalah bilangan positif");
        } else if (angka < 0) {
            System.out.println(angka + " adalah bilangan negatif");
        } else {
            System.out.println("Bilangan tersebut adalah nol");
        }
        
        sc.close();
    }
}
