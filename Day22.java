import java.util.Scanner;
public class Day22 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan panjang sisi persegi (cm): ");
            double sisi = scanner.nextDouble();

            double luas = sisi * sisi;

            System.out.println("Luas persegi dengan sisi " + sisi + " cm adalah " + luas + " cm²");

            scanner.close();
        }
    }


