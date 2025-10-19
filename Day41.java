//SOAL1
import java.util.Scanner;

public class evaluasi4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Program Hitung Diskon ");

        System.out.print("Masukkan jumlah barang : ");
        int jumlahBarang = sc.nextInt();

        System.out.print("Masukkan harga per barang : ");
        double hargaPerBarang = sc.nextDouble();

        System.out.print("Apakah Anda member? (ketik 'true' atau 'false') : ");
        boolean isMember = sc.nextBoolean();

        double totalPembelian = jumlahBarang * hargaPerBarang;
        boolean berhakDiskon = (totalPembelian >= 250000) && isMember;
        double jumlahDiskon = berhakDiskon ? totalPembelian * 0.10 : 0;
        double totalBayar = totalPembelian - jumlahDiskon;

        System.out.println("\n Ringkasan Pembelian ");
        System.out.printf("Total Pembelian   : Rp %.2f%n", totalPembelian);
        System.out.printf("Berhak Diskon 10%% : %b%n", berhakDiskon);
        System.out.printf("Jumlah Diskon     : Rp %.2f%n", jumlahDiskon);
        System.out.printf("Total Bayar       : Rp %.2f%n", totalBayar);

        sc.close();
    }
}

//SOAL2
import java.util.Scanner;

public class Evaluasi5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int S = sc.nextInt();
        int L= sc.nextInt();
        int selesai = ( S + L) % 24;
        int tidur;
        if (selesai < 9) {
            tidur = 9 - selesai;
        } else  {
            tidur =0;

        }
        System.out.println(tidur + "jam");

        }
    }





