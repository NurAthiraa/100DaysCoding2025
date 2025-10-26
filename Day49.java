public class Day49 {
    public static void main(String[] args) {
        System.out.println("===== Demonstrasi Operator Ternary =====");

        int a = 8, b = 12;
        System.out.println("1. Nilai terbesar antara " + a + " dan " + b + " adalah " + ((a > b) ? a : b));

        String hasil = (a + b > 15) ? "Jumlah besar" : "Jumlah kecil";
        System.out.println("2. Hasil penjumlahan termasuk: " + hasil);

        double suhu = 37.5;
        System.out.println("3. Suhu tubuh " + suhu + "°C menunjukkan kondisi: " + ((suhu > 37) ? "Demam" : "Normal"));

        boolean sama = (a == b) ? true : false;
        System.out.println("4. Apakah " + a + " sama dengan " + b + "? " + sama);

        int nilai = 85;
        String grade = (nilai >= 90) ? "A" : (nilai >= 75) ? "B" : "C";
        System.out.println("5. Nilai ujian: " + nilai + " = " + grade);

        System.out.println("========================================");
    }
}
