import java.util.Scanner;

public class MerebutKembali {

    static int[] baru;
    static int n;

    static int retas(int[] arr) {
        n = arr.length;
        baru = new int[n];
        boolean[] terisi = new boolean[n];
        int p = 0;

        for (int x : arr) {
            int idx = x % n;

            while (terisi[idx]) {
                idx = (idx + 1) % n;
                p++;
            }

            baru[idx] = x;
            terisi[idx] = true;
        }

        return p;
    }

    static String susunKode(int p) {
        StringBuilder sb = new StringBuilder();

        for (int x : baru) {
            if (sb.length() >= p) {
                break;
            }
            sb.append(x);
        }

        return sb.substring(0, p);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int p = retas(arr);
        String kode = susunKode(p);

        System.out.println(kode);
    }
}

