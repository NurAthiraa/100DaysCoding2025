import java.util.Scanner;

public class Day30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan umur anak: ");
        int umur = scanner.nextInt();

        boolean syaratMinimal = umur >= 1;
        boolean syaratMaksimal = umur <= 5;

        System.out.println("Memenuhi syarat minimal (>= 1 tahun): " + syaratMinimal);
        System.out.println("Memenuhi syarat maksimal (<= 5 tahun): " + syaratMaksimal);

        if (syaratMinimal && syaratMaksimal) {
            System.out.println("Anak tersebut termasuk kategori BALITA.");
        } else {
            System.out.println("Anak tersebut TIDAK termasuk kategori balita.");
        }

        scanner.close();
    }
}
