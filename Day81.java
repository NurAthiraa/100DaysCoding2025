public class Day81 {
    public static void main(String[] args) {

        int[] nilai = { 85, 90, 78, 88, 95 };

        System.out.println("\n======= DATA NILAI AWAL =======");
        System.out.println("Siswa Pertama     : " + nilai[0]);
        System.out.println("Siswa Terakhir    : " + nilai[nilai.length - 1]);

        System.out.println("\n======= UPDATE NILAI SISWA =======");
        System.out.println("Nilai Lama (Siswa 3) : " + nilai[2]);
        nilai[2] = 100;
        System.out.println("Nilai Baru (Siswa 3) : " + nilai[2]);

        System.out.println("\n======= OPERASI MATEMATIKA =======");
        double rata12 = (nilai[0] + nilai[1]) / 2.0;
        System.out.println("Rata-rata Siswa 1 & 2 : " + rata12);

        System.out.println("\n==================================\n");
    }
}
