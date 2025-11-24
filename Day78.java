import java.util.Scanner;

public class Day78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== DAFTAR AKUN BARU ===");
        System.out.print("Masukkan Username: ");
        String username = sc.nextLine().trim();

        if (username.isEmpty()) {
            System.out.println("ERROR: Username tidak boleh kosong!");
            return;
        }

        if (username.length() > 12) {
            System.out.println("ERROR: Username terlalu panjang (maks 12)!");
            return;
        }

        System.out.print("Masukkan Password: ");
        String pass = sc.nextLine();

        if (pass.length() < 8) {
            System.out.println("ERROR: Password minimal 8 karakter!");
            return;
        }

        if (pass.toLowerCase().contains("admin")) {
            System.out.println("ERROR: Password tidak boleh mengandung kata 'admin'!");
            return;
        }

        if (!Character.isUpperCase(pass.charAt(0))) {
            System.out.println("ERROR: Karakter pertama password harus huruf kapital!");
            return;
        }

        System.out.print("Ulangi Password: ");
        String ulang = sc.nextLine();

        if (!ulang.equals(pass)) {
            System.out.println("ERROR: Password tidak cocok!");
            return;
        }

        System.out.println("SUKSES: Pendaftaran Berhasil!");
        System.out.println("Username '" + username.toLowerCase() + "' telah aktif.");
    }
}
