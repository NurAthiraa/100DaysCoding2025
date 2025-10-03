public class Day26 {
        public static void main(String[] args) {
            int x = 5;
            System.out.println("Nilai awal x: " + x);

            // Aritmatika
            System.out.println("\n=== Aritmatika ===");
            x += 3; System.out.println("x += 3: " + x);
            x = 5; x -= 2; System.out.println("x -= 2: " + x);
            x = 5; x *= 4; System.out.println("x *= 4: " + x);
            x = 5; x /= 2; System.out.println("x /= 2: " + x);
            x = 5; x %= 3; System.out.println("x %= 3: " + x);

            // Bitwise (x=5 biner: 101)
            System.out.println("\n=== Bitwise ===");
            x = 5; x &= 3; System.out.println("x &= 3: " + x + " (101 & 011 = 001 = 1)");
            x = 5; x |= 3; System.out.println("x |= 3: " + x + " (101 | 011 = 111 = 7)");
            x = 5; x ^= 3; System.out.println("x ^= 3: " + x + " (101 ^ 011 = 110 = 6)");
            x = 5; x <<= 2; System.out.println("x <<= 2: " + x + " (101 << 2 = 10100 = 20)");
            x = 5; x >>= 1; System.out.println("x >>= 1: " + x + " (101 >> 1 = 10 = 2)");

            System.out.println("\nPerbedaan: Aritmatika pada nilai keseluruhan; "
                    + "Bitwise pada bit individual (efisien untuk shift seperti * / 2^n).");
        }
    }


