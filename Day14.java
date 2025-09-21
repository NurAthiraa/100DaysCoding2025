import java.util.Scanner;
    public class Day14 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Masukkan angka bulat (contoh 123): ");
            String strInt = input.nextLine();

            System.out.print("Masukkan angka pecahan (contoh 123.45): ");
            String strDesimal = input.nextLine();

            System.out.print("Masukkan kondisi (true/false, bukan 'jadian'): ");
            String strBool = input.nextLine();

            // 6 tipe data angka
            byte dataByte = Byte.parseByte(strInt);
            short dataShort = Short.parseShort(strInt);
            int dataInt = Integer.parseInt(strInt);
            long dataLong = Long.parseLong(strInt);
            float dataFloat = Float.parseFloat(strDesimal);
            double dataDouble = Double.parseDouble(strDesimal);

            // 1 tipe data kondisi
            boolean dataBoolean = Boolean.parseBoolean(strBool);

            // Output hasil konversi dengan gaya kocak
            System.out.println("\n=== HASIL KONVERSI NGAKAK ===");
            System.out.println("String ke byte    : " + dataByte + " (sekecil hatimu)");
            System.out.println("String ke short   : " + dataShort + " (kayak liburan semester, cepet banget habis)");
            System.out.println("String ke int     : " + dataInt + " (integer banget, bukan integernet)");
            System.out.println("String ke long    : " + dataLong + " (sepanjang antrian bayar UKT)");
            System.out.println("String ke float   : " + dataFloat + " (float kayak dompetku, melayang-layang)");
            System.out.println("String ke double  : " + dataDouble + " (double kayak tugas kampus: banyak dan dobel-dobel)");
            System.out.println("String ke boolean : " + dataBoolean + " (true kalau kamu masih kuat kuliah, false kalau sudah menyerah)");
        }
    }


