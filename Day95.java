public class Day95 {

    public static void gambarSegitiga(int tinggi, char simbol) {
        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(simbol + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void cetakStruk(String namaBarang, int harga, int jumlah) {
        int total = harga * jumlah;

        System.out.println("Barang: " + namaBarang);
        System.out.println("Qty   : " + jumlah + " x " + harga);
        System.out.println("Total : Rp " + total);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        System.out.println("Pola Segitiga (5, #):");
        gambarSegitiga(5, '#');

        System.out.println("Pola Segitiga (4, $):");
        gambarSegitiga(4, '$');

        System.out.println("--- Tes Cetak Struk ---");
        cetakStruk("Kopi Susu", 15000, 2);
        cetakStruk("Nasi Goreng", 25000, 1);
    }
}
