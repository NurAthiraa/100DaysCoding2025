import java.util.Scanner;

public class Day32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Apakah Anda anggota premium? (true/false): ");
        boolean anggotaPremium = input.nextBoolean();

        System.out.print("Apakah Anda memiliki undangan khusus? (true/false): ");
        boolean undanganKhusus = input.nextBoolean();

        boolean dapatAksesVip = anggotaPremium || undanganKhusus;

        System.out.println("Dapat akses VIP: " + dapatAksesVip);

        input.close();
    }
}
