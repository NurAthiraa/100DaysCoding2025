import java.util.Scanner;
        public class Day16{
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int x = sc.nextInt();
                int totalKapasitas = x * 50;
                int biayaPerKursi = (x * 7500000) / totalKapasitas;
                System.out.println("Total kapasitas: " + totalKapasitas);
                System.out.println("Biaya per kursi: Rp " + biayaPerKursi);
            }
        }




