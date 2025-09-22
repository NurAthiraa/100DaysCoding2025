public class Day15 {
    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "5";

        String gabungan = str1 + str2;
        System.out.println("Sebelum parse (String digabung): " + gabungan);

        int angka1 = Integer.parseInt(str1);
        int angka2 = Integer.parseInt(str2);

        int jumlah = angka1 + angka2;
        int kurang = angka1 - angka2;

        System.out.println("Setelah parse (penjumlahan): " + jumlah);
        System.out.println("Setelah parse (pengurangan): " + kurang);
    }
}
