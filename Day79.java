import java.util.Scanner;

public class Day79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usernameReg;
        String passwordReg;

        System.out.println("=== REGISTRASI AKUN ===");
        System.out.print("Buat Username : ");
        usernameReg = sc.nextLine().trim();

        System.out.print("Buat Password : ");
        passwordReg = sc.nextLine().trim();

        System.out.println("\nAkun berhasil dibuat!\n");

        System.out.println("=== LOGIN AKUN ===");

        while (true) {
            System.out.print("Masukkan Username : ");
            String userLogin = sc.nextLine().trim();

            System.out.print("Masukkan Password : ");
            String passLogin = sc.nextLine().trim();

            if (userLogin.equals(usernameReg) && passLogin.equals(passwordReg)) {
                System.out.println("\nLogin Berhasil!");
                break;
            } else {
                System.out.println("Gagal: Username atau Password salah! Silakan coba lagi.\n");
            }
        }

        sc.close();
    }
}
