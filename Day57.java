public class Day57 {
    public static void main(String[] args) {
        int sisi = 5;

        System.out.println("========================================");
        System.out.println("==     PROGRAM PERSEGI BOLONG (Day57) ==");
        System.out.println("========================================\n");

        for (int i = 1; i <= sisi; i++) {
            for (int j = 1; j <= sisi; j++) {
                if (i == 1 || i == sisi || j == 1 || j == sisi) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
