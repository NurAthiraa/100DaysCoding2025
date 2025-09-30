import java.util.Scanner;
    public class Day23 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Program Menghitung Luas Persegi Panjang");
            System.out.print("Silakan masukkan panjang persegi panjang (cm): ");
            double panjang = scanner.nextDouble();
            System.out.print("Silakan masukkan lebar persegi panjang (cm): ");
            double lebar = scanner.nextDouble();
            double luas = panjang * lebar;
            System.out.printf("Luas persegi panjang, dengan panjang %.2f cm dan lebar %.2f cm memiliki luas sebesar: %.2f cm%n", panjang, lebar, luas);
            scanner.close();
        }
    }

