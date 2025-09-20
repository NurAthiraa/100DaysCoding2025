import java.util.Scanner;
    public class NilaiMahasiswa {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("=== SISTEM PENILAIAN MAHASISWA ===");
            System.out.print("Masukkan nama: ");
            String nama = sc.nextLine();

            System.out.print("Masukkan NIM: ");
            String nim = sc.nextLine();

            System.out.print("Masukkan nilai (0 - 100): ");
            int nilai = sc.nextInt();

            String grade;
            if (nilai >= 90) {
                grade = "A (Andai semua dosen sebaik hati ini)";
            } else if (nilai >= 75) {
                grade = "B (Bagus, tapi jangan kebanyakan rebahan)";
            } else if (nilai >= 60) {
                grade = "C (Cukup... cukup bikin orang tua nangis)";
            } else if (nilai >= 40) {
                grade = "D (Doa orang tua masih menyelamatkanmu)";
            } else {
                grade = "E (End of semester, selamat mengulang )";
            }

            System.out.println("\n--- HASIL ---");
            System.out.println("Nama : " + nama);
            System.out.println("NIM  : " + nim);
            System.out.println("Nilai: " + nilai);
            System.out.println("Grade: " + grade);
        }
    }


