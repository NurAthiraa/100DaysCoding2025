//Soal1
import java.util.Scanner;

public class EvaluasiBesar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan batas bawah: ");
        int batasBawah = sc.nextInt();

        System.out.print("Masukkan batas atas: ");
        int batasAtas = sc.nextInt();

        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();

        if (angka >= batasBawah && angka <= batasAtas) {
            System.out.println("YAYAYAYA");
        } else {
            System.out.println("NONONONO");
        }

        sc.close();
    }
}

//Soal 2
import java.util.Scanner;

public class EvaluasiBesar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai ujian Anda: ");
        int nilai = sc.nextInt();

        if (nilai > 70) {
            System.out.println("Ujian Kroco Ji Pale");
        } else {
            System.out.println("Sa Jappo’ka Aih");
        }

        sc.close();
    }
}

// Soal 3
import java.util.Scanner;

public class EvaluasiBesar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka = input.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Iyaji");
        } else {
            System.out.println("Tidakji");
        }

        input.close();
    }
}

