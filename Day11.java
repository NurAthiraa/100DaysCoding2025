import java.util.Scanner;
public class Day11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap (bukan nama mantan): ");
        String namaLengkap = input.nextLine();

        System.out.print("Masukkan Umur (jangan ngaku 17 padahal 30): ");
        byte umur = input.nextByte();

        System.out.print("Masukkan Tahun Lahir (real ya, jangan 2099): ");
        short tahunLahir = input.nextShort();

        System.out.print("Masukkan Nomor ID (bukan nomor antrean geprek): ");
        int nomorId = input.nextInt();

        System.out.print("Masukkan Nomor Telepon (jangan kasih nomor darurat RS): ");
        long nomorTelepon = input.nextLong();

        System.out.print("Masukkan IPK (kalau 4.5 berarti kamu Avenger): ");
        float ipk = input.nextFloat();

        System.out.print("Masukkan Berat Badan (kg, jangan satuan piksel): ");
        double beratBadan = input.nextDouble();

        System.out.print("Apakah anda mahasiswa aktif? (true/false, jangan jawab maybe): ");
        boolean isAktif = input.nextBoolean();

        input.nextLine();

        String huruf;
        while (true) {
            System.out.print("Masukkan minimal 3 huruf (contoh: ABCDEFG): ");
            huruf = input.nextLine();
            if (huruf.length() >= 3) {
                break;
            } else {
                System.out.println("Error: input harus minimal 3 huruf, jangan pelit huruf!");
            }
        }

        char hurufKetiga = huruf.charAt(2);

        System.out.println("\n=== Data Pendaftaran Monster Imut ===");
        System.out.println("Nama Lengkap   : " + namaLengkap);
        System.out.println("Umur           : " + umur + " tahun (masih muda katanya)");
        System.out.println("Tahun Lahir    : " + tahunLahir + " (tahun keramat katanya)");
        System.out.println("Nomor ID       : " + nomorId + " (bukan nomor togel!)");
        System.out.println("Nomor Telepon  : " + nomorTelepon + " (jangan ghosting ya)");
        System.out.println("IPK            : " + ipk + " (auto cumlaude atau cumlaos)");
        System.out.println("Berat Badan    : " + beratBadan + " kg (tim diet mulai gelisah)");
        System.out.println("Mahasiswa Aktif: " + isAktif + " (kalau false ya numpang wifi kampus)");
        System.out.println("Huruf ke-3     : " + hurufKetiga + " (itu dia huruf keramatmu)");
    }
}
