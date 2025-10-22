import java.util.Scanner;

public class Day45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka (1-7): ");
        int angka = sc.nextInt();

        String hari;

        switch (angka) {
            case 1:
                hari = "Senin";
                break;
            case 2:
                hari = "Selasa";
                break;
            case 3:
                hari = "Rabu";
                break;
            case 4:
                hari = "Kamis";
                break;
            case 5:
                hari = "Jumat";
                break;
            case 6:
                hari = "Sabtu";
                break;
            case 7:
                hari = "Minggu";
                break;
            default:
                hari = null;
        }

        if (hari != null) {
            System.out.println("Sekarang adalah hari " + hari);
        } else {
            System.out.println("Jumlah hari hanya 7");
        }

        sc.close();
    }
}
