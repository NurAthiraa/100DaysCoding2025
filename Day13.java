import java.util.Scanner;
public class Evalusisoal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("judul: ");
        final String JUDUL = sc.nextLine();

        System.out.println("Masukkan tahun: ");
        short tahun = sc.nextShort();
        sc.nextLine();

        System.out.print("Masukkan nama: ");
        String nama = sc.nextLine();

        System.out.print("Masukkan jarak perjalanan (km): ");
        double perjalanan = sc.nextDouble();

        System.out.print("Masukkan harga: ");
        int harga = sc.nextInt();

        System.out.print("Masukkan nama kendaraan (1 huruf): ");
        char kendaraan = sc.next().charAt(0);

        System.out.print("Jumlah hari: ");
        float hari = sc.nextFloat();

        System.out.print("Kecepatan rata-rata: ");
        double kecepatan = sc.nextDouble();

        System.out.print("Total biaya: ");
        long totalBiaya = sc.nextLong();

        System.out.print("Status Perjalanan (true/false): ");
        boolean status = sc.nextBoolean();

        System.out.println("\n=== HASIL CERITA ===");
        System.out.println("Judul: " + JUDUL);
        System.out.println("Pada tahun "  + tahun + " ,");
        System.out.println("seorang mahasiswa bernama " + nama );
        System.out.println("melakukan perjalanan sejauh " + perjalanan + " km");
        System.out.println("hanya demi makan ayam geprek seharga " + harga + " rupiah.");
        System.out.println("Ia mengunjungi 3 kota dengan menggunakan kendaraan berinisial " + kendaraan+ ". ");
        System.out.println("Perjalanan tersebut memakan waktu " + hari+ " hari");
        System.out.println("dengan rata-rata kecepatan " + kecepatan+ " km/jam. ");
        System.out.println("Total biaya perjalanan mencapai " + totalBiaya+ " rupiah ");
        System.out.println("Status perjalanan : " + status );
    }
}


import java.util.Scanner;
public class Evalusisoal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan universitas: ");
        String uni = sc.nextLine();

        System.out.print("Masukkan nama : ");
        String nama = sc.nextLine();

        System.out.print("Masukkan NIM : ");
        String nim = sc.nextLine();

        System.out.print("Masukkan semester : ");
        int semester = sc.nextInt();

        System.out.print("Masukkan jumlah sks : ");
        byte sks = sc.nextByte();

        System.out.print("Masukkan tahun masuk : ");
        short tahun = sc.nextShort();

        System.out.print("Masukkan IPK : ");
        float ipk = sc.nextFloat();

        System.out.print("Masukkan tinggi badan : ");
        double tB = sc.nextDouble();

        System.out.print("Masukkan gender (L/P/waria) : ");
        char gender = sc.next().charAt(0);

        System.out.print("Masukkan status perkuliahan : ");
        boolean status = sc.nextBoolean();

        System.out.println("\n======================== ");
        System.out.println("BIODATA MAHASISWA");
        System.out.println("\n======================== ");
        System.out.printf("%-15s : %-10s %n","Universitas", uni);
        System.out.printf("%-15s : %-10s %n", "Nama" ,nama);
        System.out.printf("%-15s : %-10s %n", "NIM" ,nim);
        System.out.printf("%-15s : %-10d %n","Semester", semester);
        System.out.printf("%-15s : %-10d %n","Jumlah sks", sks);
        System.out.printf("%-15s : %-10d %n","Tahun Masuk", tahun);
        System.out.printf("%-15s : %-10.2f %n","IPK" , ipk);
        System.out.printf("%-15s : %-10.2f %n","Tinggi Badan" , tB);
        System.out.printf("%-15s : %-10c %n","Jenis Kelamin" , gender);
        System.out.printf("%-15s : %-10b %n","Status Aktif", status);

    }
}

import java.util.Scanner;
public class Evalusisoal3 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
         final double PHI = 3.14;

        System.out.println("Masukkan nilai r: ");
        double r = sc.nextDouble();
        double luas = PHI * (r * r);
        double keliling = 2 * PHI * r;

        System.out.println("Jadi, luas Lingkaran adalah " + luas + " cm2 dan keliling lingkaran adalah " + keliling + " cm jika nilai r = " + r + " cm");

        System.out.println("\nMasukkan lagi nilai r");
        r = sc.nextDouble();
        luas = PHI * (r * r);
        keliling = 2 * PHI * r;
        System.out.println("Jika nilai r kali ini adalah " + r + " cm, maka luas lingkaran = " + luas + " cm2 dan keliling lingkaran = " + keliling + " cm");



    }
}
