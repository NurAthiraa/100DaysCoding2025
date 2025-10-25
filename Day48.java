import java.util.Scanner;

public class Day48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean valid = true;

        System.out.print("Masukkan angka pertama: ");
        String input1 = sc.next();
        System.out.print("Masukkan operator (+, -, *, /): ");
        String operator = sc.next();
        System.out.print("Masukkan angka kedua: ");
        String input2 = sc.next();

        double angka1 = 0;
        double angka2 = 0;

        try {
            angka1 = Double.parseDouble(input1);
            angka2 = Double.parseDouble(input2);
        } catch (NumberFormatException e) {
            System.out.println("Error: Input angka tidak valid!");
            valid = false;
        }

        if (valid) {
            double hasil = 0;

            switch (operator) {
                case "+":
                    hasil = angka1 + angka2;
                    break;
                case "-":
                    hasil = angka1 - angka2;
                    break;
                case "*":
                    hasil = angka1 * angka2;
                    break;
                case "/":
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

            if (valid) {
                // Tentukan apakah hasilnya int atau double
                boolean angka1Bulat = angka1 % 1 == 0;
                boolean angka2Bulat = angka2 % 1 == 0;
                boolean hasilBulat = hasil % 1 == 0;

                if (angka1Bulat && angka2Bulat && hasilBulat) {
                    System.out.println("Hasil: " + (int) hasil);
                } else {
                    System.out.println("Hasil: " + hasil);
                }
            }
        }

        sc.close();
    }
}
