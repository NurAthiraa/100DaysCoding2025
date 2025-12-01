public class Day83StringMax {

    public static void main(String[] args) {

        String[] namaSiswa = {"Ai", "Zerlina", "Aika", "Kayla", "Yanto"};

        String namaPalingAkhir = namaSiswa[0];

        System.out.println("=== Daftar Nama ===");
        for (int i = 0; i < namaSiswa.length; i++) {
            System.out.println("== " + namaSiswa[i] + " ==");

            if (namaSiswa[i].compareTo(namaPalingAkhir) > 0) {
                namaPalingAkhir = namaSiswa[i];
            }
        }

        System.out.println("===========================");
        System.out.println("== Siswa Absen Terakhir (Max): " + namaPalingAkhir + " ==");
    }
}

