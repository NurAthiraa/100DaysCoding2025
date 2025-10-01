import java.util.Scanner;

public class LuasLingkaran {
    public static void main(String[] args) {
        final double PI = 3.14159;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = scanner.nextDouble();

        double luas = PI * jariJari * jariJari;

        System.out.println("Luas lingkaran dengan jari-jari " + jariJari + " adalah " + luas);

        scanner.close();
    }
}




