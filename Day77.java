import java.util.Scanner;

public class Day77 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Hashtag: ");
        String tagAsli = sc.nextLine();

        String tahap1 = tagAsli.trim();
        String tahap2 = tahap1.replace("-", " ");
        String tahap3 = tahap2.substring(1);
        String tagBersih = tahap3.toUpperCase();

        System.out.println("\n=== Hasil Cleaning ===");
        System.out.println("Asli  : " + tagAsli);
        System.out.println("Bersih: " + tagBersih);
    }
}
