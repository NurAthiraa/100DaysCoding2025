public class Day25 {
    public static void main(String[] args) {
        int x = 5;

        System.out.println("=== Contoh Pre-Increment ( ++x ) ===");
        System.out.println("Nilai awal x = " + x);
        System.out.println("Hasil ++x = " + (++x));
        System.out.println("Nilai x sekarang = " + x);
        System.out.println();

        x = 5;

        System.out.println("=== Contoh Post-Increment ( x++ ) ===");
        System.out.println("Nilai awal x = " + x);
        System.out.println("Hasil x++ = " + (x++));
        System.out.println("Nilai x sekarang = " + x);
        System.out.println();

        System.out.println("=== Studi Kasus Kasir ===");
        int nomorStruk = 100;
        System.out.println("Nomor struk pertama (Post-Increment): " + (nomorStruk++));
        System.out.println("Nomor struk kedua (Post-Increment): " + (nomorStruk++));
        System.out.println("Nomor struk berikutnya (Pre-Increment): " + (++nomorStruk));
    }
}
