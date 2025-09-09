import java.util.Date;
public class Day2 {
        public static void main(String[] args) {
            //Soal 1: println()
            System.out.println("=== SOAL 1 ===");
            System.out.println("Saya akan bertahan 100 Hari Ngoding");
            System.out.println("dan akan menjadi anggota resmi ISC 💙\n");

            //Soal 2: print()
            System.out.println("=== SOAL 2 ===");
            System.out.println("Selamat datang ");
            System.out.println("di ISC 💙\n\n");

            //Soal 3: printf()
            System.out.println("=== SOAL 3 ===");

            String nama = "Nur Athira";
            String nim = "D0224036";
            String kelas = "D INF";
            int umur =  19;
            double tinggi = 164.3;
            Date tgl = new Date();

            System.out.printf("| %-12s : %-20s |%n", "Nama", nama);
            System.out.printf("| %-12s : %-20s |%n", "NIM", nim);
            System.out.printf("| %-12s : %-20s |%n", "Kelas", kelas);
            System.out.printf("| %-12s : %-20d |%n", "Umur", umur);
            System.out.printf("| %-12s : %-20.1f |%n", "Tinggi", tinggi);
            System.out.printf("| %-12s : %-20tA |%n", "Hari", tgl);
            System.out.printf("| %-12s : %-20tF |%n", "Tanggal", tgl);
        }
    }

