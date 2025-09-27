import java.util.Scanner;
public class Day20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Tahun Masuk Karyawan: ");
        int tahunMasuk = input.nextInt();

        System.out.print("Masukkan Nomor Urut Karyawan: ");
        int nomorUrut = input.nextInt();

        String idKaryawan = String.format("KRY-%d-%d", tahunMasuk, nomorUrut);

        System.out.println("\n=== HASIL ID KARYAWAN ===");
        System.out.println("ID Karyawan: " + idKaryawan);

        input.close();
    }
}
