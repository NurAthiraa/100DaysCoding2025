public class Day19{
    public static void main(String[] args) {
        // ===== Konversi Paksa (Explicit / Narrowing) =====
        float tinggiBadanFloat = 172.55f;
        short tinggiBadanShort = (short) tinggiBadanFloat; // pecahan hilang
        System.out.println("Float ke Short (narrowing): " + tinggiBadanShort);

        long populasi = 350000L;
        int populasiInt = (int) populasi;
        System.out.println("Long ke Int (narrowing): " + populasiInt);

        // ===== Konversi Otomatis (Implicit / Widening) =====
        char huruf = 'B';
        int kodeAscii = huruf;
        double kodeDouble = kodeAscii;
        System.out.println("Char ke Int (widening): " + kodeAscii);
        System.out.println("Int ke Double (widening): " + kodeDouble);

        short angkaKecil = 32000;
        long angkaBesar = angkaKecil; // short -> long (otomatis)
        System.out.println("Short ke Long (widening): " + angkaBesar);
    }
}


