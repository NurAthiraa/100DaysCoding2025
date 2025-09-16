public class Day9 {
    public static void main(String[] args) {
        // =========================
        // Deklarasi variabel
        // =========================
        String nama;
        String nim;
        char kelas;
        int umur;

        // =========================
        // Inisialisasi
        // =========================
        nama = "Nur Athira";
        nim = "D0224036";
        kelas = 'D';
        umur = 18;

        System.out.println("=== Profil Awal ===");
        System.out.println("Nama   : " + nama);
        System.out.println("NIM    : " + nim);
        System.out.println("Kelas  : " + kelas);
        System.out.println("Umur   : " + umur);

        // =========================
        // Update data
        // =========================
        nama = "Nur Athira Rahman";
        kelas = 'C';
        umur = 19;

        System.out.println("\n=== Profil Setelah Update ===");
        System.out.println("Nama   : " + nama);
        System.out.println("NIM    : " + nim);
        System.out.println("Kelas  : " + kelas);
        System.out.println("Umur   : " + umur);
    }
}
