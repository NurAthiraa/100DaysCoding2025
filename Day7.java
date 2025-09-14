public class Day7 {
        public static void main(String[] args) {
            // Tugas 1: Mencetak kata dalam karakter Jepang
            char ko = 'こ';
            char n1 = 'ん';
            char n2 = 'に';
            char chi = 'ち';
            char wa = 'は';

            System.out.print(ko);
            System.out.print(n1);
            System.out.print(n2);
            System.out.print(chi);
            System.out.print(wa);
            System.out.println();

            //  Tugas 2: Menampilkan status kondisi saat ini
            boolean isHariKerja = false;    // Misalnya hari ini bukan hari kerja
            boolean isAkhirPekan = true;     // Hari ini adalah akhir pekan
            boolean isMalam = false;         // Saat ini bukan malam


            System.out.println("Apakah sekarang hari kerja? " + isHariKerja);
            System.out.println("Apakah sekarang akhir pekan? " + isAkhirPekan);
            System.out.println("Apakah sekarang malam hari? " + isMalam);
        }
    }

