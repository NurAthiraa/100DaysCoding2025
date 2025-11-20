import java.util.Scanner;

public class Day74 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihan;
        int total = 0;

        do {
            System.out.println("\n======  K A T A L O G  ======");
            System.out.println("1. Nasi Kuning     | Rp 10.000");
            System.out.println("2. Es Teh Panas    | Rp  5.000");
            System.out.println("3. Kopi Susu       | Rp  5.000");
            System.out.println("4. Bakso Kuah      | Rp 10.000");
            System.out.println("5. Selesaikan Pembayaran");
            System.out.println("==============================");
            System.out.print("Pilih menu yang ingin dipesan : ");

            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    total += 10000;
                    break;

                case 2:
                    total += 5000;
                    break;

                case 3:
                    total += 5000;
                    break;

                case 4:
                    total += 10000;
                    break;

                case 5:
                    System.out.println("\nTotal pembayaran anda : Rp " + total);
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia, coba lagi.");
            }

        } while (pilihan != 5);
    }
}
