import java.util.Scanner;

public class Day31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai tes logika: ");
        int nilaiTes = sc.nextInt();

        System.out.print("Masukkan pengalaman coding (dalam tahun): ");
        int pengalaman = sc.nextInt();

        boolean diterima = (nilaiTes >= 80) && (pengalaman > 2);

        System.out.println("Diterima: " + diterima);

        sc.close();
    }
}
