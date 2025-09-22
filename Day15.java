import java.util.Scanner;
    public class Day15{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // input angka dalam bentuk String
            System.out.print("Masukkan angka pertama (String): ");
            String str1 = sc.nextLine();
            System.out.print("Masukkan angka kedua (String): ");
            String str2 = sc.nextLine();

            // operasi sebelum parse
            String gabungan = str1 + str2;
            System.out.println("\nSebelum parse (String digabung): " + gabungan);

            // parse String ke int
            int angka1 = Integer.parseInt(str1);
            int angka2 = Integer.parseInt(str2);

            // operasi setelah parse (penjumlahan dan pengurangan)
            int jumlah = angka1 + angka2;
            int kurang = angka1 - angka2;

            System.out.println("Setelah parse (penjumlahan): " + jumlah);
            System.out.println("Setelah parse (pengurangan): " + kurang);
        }
    }

