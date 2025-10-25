import java.util.Scanner;

public class day48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valid = true;

        double angka1 = 0;
        double angka2 = 0;
        char operator = ' ';
        double hasil = 0;

        try {
            System.out.print("Masukkan angka pertama: ");
            angka1 = sc.nextDouble();

            System.out.print("Masukkan operator (+, -, *, /): ");
            operator = sc.next().charAt(0);

            System.out.print("Masukkan angka kedua: ");
            angka2 = sc.nextDouble();
        } catch (Exception e) {
            System.out.println("Error: Input angka tidak valid!");
            valid = false;
        }

        if (valid) {
            switch (operator) {
                case '+':
                    hasil = angka1 + angka2;
                    break;
                case '-':
                    hasil = angka1 - angka2;
                    break;
                case '*':
                    hasil = angka1 * angka2;
                    break;
                case '/':
                    if (angka2 == 0) {
                        System.out.println("Error: Pembagian dengan nol tidak diperbolehkan!");
                        valid = false;
                    } else {
                        hasil = angka1 / angka2;
                    }
                    break;
                default:
                    System.out.println("Operator tidak dikenali. Gunakan +, -, *, atau /.");
                    valid = false;
            }
        }

        if (valid) {
            boolean inputDesimal = (angka1 % 1 != 0) || (angka2 % 1 != 0);
            boolean hasilBulat = hasil % 1 == 0;

            if (inputDesimal) {
                System.out.println("Hasil: " + hasil);
            } else {
                if (hasilBulat) {
                    System.out.println("Hasil: " + (int) hasil);
                } else {
                    System.out.println("Hasil: " + hasil);
                }
            }
        }

        sc.close();
    }
}
