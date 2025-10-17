import java.util.Scanner;

public class Day40 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("         KALKULATOR SEDERHANA     ");
        System.out.println("==================================");

        System.out.print("Masukkan angka pertama: ");
        double angka1 = SC.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /, %): ");
        char operator = SC.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double angka2 = SC.nextDouble();

        System.out.println("----------------------------------");

        double hasil;

        if (operator == '+') {
            hasil = angka1 + angka2;
            System.out.println("Hasil: " + angka1 + " + " + angka2 + " = " + hasil);
        } else if (operator == '-') {
            hasil = angka1 - angka2;
            System.out.println("Hasil: " + angka1 + " - " + angka2 + " = " + hasil);
        } else if (operator == '*') {
            hasil = angka1 * angka2;
            System.out.println("Hasil: " + angka1 + " * " + angka2 + " = " + hasil);
        } else if (operator == '/') {
            if (angka2 != 0) {
                hasil = angka1 / angka2;
                System.out.println("Hasil: " + angka1 + " / " + angka2 + " = " + hasil);
            } else {
                System.out.println("Error: Pembagian dengan nol tidak diperbolehkan!");
            }
        } else if (operator == '%') {
            if (angka2 != 0) {
                hasil = angka1 % angka2;
                System.out.println("Hasil: " + angka1 + " % " + angka2 + " = " + hasil);
            } else {
                System.out.println("Error: Sisa bagi dengan nol tidak diperbolehkan!");
            }
        } else {
            System.out.println("Operator tidak dikenal! Gunakan (+, -, *, /, %)");
        }

        System.out.println("==================================");
        System.out.println("     Terima kasih telah memakai   ");
        System.out.println("==================================");

        SC.close();
    }
}

