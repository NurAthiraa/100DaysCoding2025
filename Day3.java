public class Day3 {
    public static void main(String[] args) {
        // Cetak pakai println()
        System.out.println("Hello World!");
        // Katanya simpel, tapi tetep error gara-gara lupa titik koma kemarin 

        // Cetak pakai print()
        System.out.print("Aku sering begadang ngerjain coding ");
        System.out.print("...tapi hasilnya cuma error merah semua di IntelliJ \n"); // Programmer trauma

        /* Cetak pakai printf()
           printf untuk format teks, tapi tetep aja sering lupa %d.
           Biasa anak informatika: error sepele bisa bikin nangis.
        */
        int bug = 9999;
        System.out.printf("Jumlah error di project: %d", bug);
        System.out.printf(", padahal baris kodenya cuma 10 💻\n");
    }
}
