import java.util.Scanner;

public class Day83 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Penghitungan Pengeluaran 7 Hari ===");
        System.out.print("Mau input manual? (y/n): ");
        String pilih = input.nextLine();

        int[] pengeluaran = new int[7];

        if (pilih.equalsIgnoreCase("y")) {
            System.out.println("\nSilakan masukkan pengeluaran per hari:");
            for (int i = 0; i < pengeluaran.length; i++) {
                System.out.print("Hari ke-" + (i + 1) + ": Rp ");
                pengeluaran[i] = input.nextInt();
            }
        } else {
            pengeluaran = new int[]{20000, 50000, 30000, 15000, 10000, 40000, 100000};
        }

        System.out.println("\n--- Rincian Pengeluaran ---");
        int total = 0;

        for (int i = 0; i < pengeluaran.length; i++) {
            System.out.println("Hari ke-" + (i + 1) + ": Rp " + pengeluaran[i]);
            total += pengeluaran[i];
        }

        System.out.println("---------------------------");
        System.out.println("Total Pengeluaran Seminggu: Rp " + total);
    }
}
