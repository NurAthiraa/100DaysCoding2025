public class Day53 {
    public static void main(String[] args) {

        int menu = 3;

        System.out.println("========================================");
        System.out.println("         PROGRAM KEYWORD BREAK");
        System.out.println("========================================\n");

        System.out.println(">>> Contoh 1: Break pada Switch Case <<<\n");

        switch (menu) {
            case 1:
                System.out.println("Kamu memilih Nasi Goreng");
                break;
            case 2:
                System.out.println("Kamu memilih Mie Goreng");
                break;
            case 3:
                System.out.println("Kamu memilih Ayam Geprek");
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
                break;
        }

        System.out.println("\nSelesai mengeksekusi switch-case\n");

        System.out.println(">>> Contoh 2: Break pada Perulangan <<<\n");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Hitungan ke-" + i);
            if (i == 5) {
                System.out.println("\nTombol STOP DARURAT ditekan!");
                System.out.println("Perulangan berhenti di angka " + i + "\n");
                break;
            }
        }

        System.out.println("Program selesai dijalankan");
    }
}
