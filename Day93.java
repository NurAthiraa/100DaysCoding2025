public class Day93 {
    public static void main(String[] args) {

        double angka1 = 3.1;
        double angka2 = 3.9;
        double angka3 = 3.4;

        double hasilCeil = Math.ceil(angka1);     // naik ke atas
        double hasilFloor = Math.floor(angka2);   // turun ke bawah
        long hasilRound = Math.round(angka3);     // ke terdekat

        System.out.println("Ceil dari " + angka1 + " = " + hasilCeil);
        System.out.println("Floor dari " + angka2 + " = " + hasilFloor);
        System.out.println("Round dari " + angka3 + " = " + hasilRound);
    }
}
