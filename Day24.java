import java.util.Scanner;
    public class Day24 {
            private static final double PI = 3.14159;

            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.print("Masukkan jari-jari lingkaran: ");
                double radius = input.nextDouble();

                double luas = hitungLuas(radius);

                tampilkanHasil(radius, luas);

                input.close();
            }

            private static double hitungLuas(double r) {
                return PI * r * r;
            }

            private static void tampilkanHasil(double r, double luas) {
                System.out.println("===== Hasil Perhitungan Luas Lingkaran =====");
                System.out.printf("Jari-jari : %.2f cm%n", r);
                System.out.printf("Luas      : %.4f cm^2%n", luas);
                System.out.println("===========================================");
            }
        }



