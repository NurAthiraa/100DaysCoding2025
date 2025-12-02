public class Day86 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array == ");
        int n = input.nextInt();

        int[] data = new int[n];

        System.out.println("=== Input Data ===");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + " == ");
            data[i] = input.nextInt();
        }

        int min = data[0];

        for (int i = 1; i < n; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }

        System.out.println("Nilai terkecil dalam array adalah == " + min);
    }
}
