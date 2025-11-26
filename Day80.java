public class Day80 {
    public static void main(String[] args) {

        String makanan[] = new String[5];
        makanan[0] = "Martabak Telor";
        makanan[1] = "Sate Ayam";
        makanan[2] = "Gado-gado";
        makanan[3] = "Mie Ayam";
        makanan[4] = "Bakso";

        System.out.println("Makanan Juara: " + makanan[0] + "  <- raja yang tidak tersentuh");
        System.out.println("Makanan Terakhir: " + makanan[4] + "  <- anak tiri keluarga makanan");

        String sebelum = makanan[2];
        makanan[2] = "Nasi Padang";

        System.out.println("ALERT!! " + sebelum + " resmi dipecat dari jabatan makanan ke-3!");
        System.out.println("Alasan pemecatan: terlalu sering muncul di kondangan.");
        System.out.println("Penggantinya adalah: " + makanan[2] + "  <- langsung naik jabatan tanpa tes!");

        System.out.println("Makanan ke-3 sekarang: " + makanan[2] + "  (sudah seperti PNS baru)");
        System.out.println("Total menu: " + makanan.length + "  (lebih banyak dari saldo e-wallet kamu)");
    }
}
