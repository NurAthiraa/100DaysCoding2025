//soal1
import java.util.Scanner;

public class Day27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int P = sc.nextInt();
        int L = sc.nextInt();

        int keramikPanjang = (P + 1) / 2;
        int keramikLebar = (L + 1) / 2;

        int totalKeramik = keramikPanjang * keramikLebar;

        System.out.println(totalKeramik);

        sc.close();
    }
}


//soal2
import java.util.Scanner;

public class Day27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);

        sc.close();
    }
}
