public class Day54 {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("     PROGRAM KEYWORD CONTINUE (Day54)    ");
        System.out.println("========================================\n");

        System.out.println("Menampilkan angka 1 sampai 20 (tanpa angka genap):");

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}

