import java.util.Scanner;

public class day79 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n==============================");
        System.out.println("       REGISTRASI AKUN");
        System.out.println("==============================");

        String username;
        String password;

        while (true) {
            System.out.print("\nBuat Username : ");
            username = input.nextLine();

            System.out.print("Buat Password : ");
            password = input.nextLine();

            if (username.isEmpty() || password.isEmpty()) {
                System.out.println("\nError: Username dan Password tidak boleh kosong!");
            } else {
                System.out.println("\nRegistrasi Berhasil!");
                break;
            }
        }

        System.out.println("\n==============================");
        System.out.println("          LOGIN AKUN");
        System.out.println("==============================");

        while (true) {
            System.out.print("\nMasukkan Username : ");
            String loginUser = input.nextLine();

            System.out.print("Masukkan Password : ");
            String loginPass = input.nextLine();

            if (loginUser.equals(username) && loginPass.equals(password)) {
                System.out.println("\nLogin Berhasil! Pintu Terbuka");
                break;
            } else {
                System.out.println("\nGagal: Username atau Password salah! Coba lagi.");
            }
        }
    }
}
