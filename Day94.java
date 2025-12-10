public class Day94 {

    public static void garisPembatas() {
        System.out.println("========================================");
    }

    public static void kotakNama(String nama) {
        System.out.println("|   Welcome, Player " + nama + "   |");
    }

    public static void main(String[] args) {
        garisPembatas();
        kotakNama("Athira");
        garisPembatas();

        System.out.println("Menu Pilihan:");
        System.out.println("1. New Game");
        System.out.println("2. Load Game");
        System.out.println("3. Exit");

        garisPembatas();
    }
}
