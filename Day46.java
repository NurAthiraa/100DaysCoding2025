import java.util.Scanner;

public class Day46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Menu Makanan ===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Ayam");
        System.out.println("3. Sate Ayam");
        System.out.println("4. Bakso");
        System.out.println("5. Ayam Geprek");
        System.out.print("Masukkan pilihan (1-5): ");

        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Kamu memilih Nasi Goreng");
                break;
            case 2:
                System.out.println("Kamu memilih Mie Ayam");
                break;
            case 3:
                System.out.println("Kamu memilih Sate Ayam");
                break;
            case 4:
                System.out.println("Kamu memilih Bakso");
                break;
            case 5:
                System.out.println("Kamu memilih Ayam Geprek");
                break;
            default:
                System.out.println("Pilihan tidak valid");
                break;
        }

        sc.close();
    }
}
