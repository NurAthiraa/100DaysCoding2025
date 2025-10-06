import java.util.Scanner;

public class PengecekanWahana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan tinggi badan Anda (cm): ");
        double tinggi = sc.nextDouble();

        System.out.print("Masukkan berat badan Anda (kg): ");
        double berat = sc.nextDouble();

        System.out.println("\nTinggi badan Anda: " + tinggi + " cm");
        System.out.println("Berat badan Anda: " + berat + " kg");

        boolean memenuhiTinggi = tinggi > 150;
        boolean memenuhiBerat = berat < 80;

        System.out.println("\nPengecekan aturan keamanan:");

        if (memenuhiTinggi) {
            System.out.println("Tinggi badan Anda memenuhi syarat (lebih dari 150 cm).");
        } else {
            System.out.println("Tinggi badan Anda tidak memenuhi syarat (harus lebih dari 150 cm).");
        }

        if (memenuhiBerat) {
            System.out.println("Berat badan Anda memenuhi syarat (kurang dari 80 kg).");
        } else {
            System.out.println("Berat badan Anda tidak memenuhi syarat (harus kurang dari 80 kg).");
        }

        if (memenuhiTinggi && memenuhiBerat) {
            System.out.println("\nAnda boleh naik wahana permainan!");
        } else {
            System.out.println("\nMaaf, Anda tidak boleh naik wahana permainan. Silakan coba wahana lain.");
        }

        sc.close();
    }
}
