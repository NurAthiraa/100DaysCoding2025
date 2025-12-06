import java.util.Scanner;

public class Day90 {

    public static int maxx(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int minn(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int x = sc.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int y = sc.nextInt();

        int maks = maxx(x, y);
        int mins = minn(x, y);

        System.out.println("Nilai maksimum = " + maks);
        System.out.println("Nilai minimum = " + mins);
    }
}
