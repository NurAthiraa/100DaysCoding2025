import java.util.Scanner;

public class Day47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka (1-7): ");
        int angka = sc.nextInt();

        String hari;

        switch (angka) {
            case 1:
                hari = "Senin - Hari Kerja";
                break;
            case 2:
                hari = "Selasa - Hari Kerja";
                break;
            case 3:
                hari = "Rabu - Hari Kerja";
                break;
            case 4:
                hari = "Kamis - Hari Kerja";
                break;
            case 5:
                hari = "Jumat - Hari Kerja";
                break;
            case 6:
                hari = "Sabtu - Hari Libur";
                break;
            case 7:
                hari = "Minggu - Hari Libur";
                break;
            default:
                hari = "Jumlah hari hanya 7!";
                break;
        }

        System.out.println("Sekarang adalah hari " + hari);
    }
}
