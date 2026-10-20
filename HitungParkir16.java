import java.util.Scanner;
public class HitungParkir16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kode, jam;
        int totalBayar = 0;

        while (true) {
            System.out.println("Pilih kendaraan: 1 = Mobil, 2 = Motor, 0 = Keluar");
            System.out.print("Kode kendaraan: ");
            kode = sc.nextInt();

            if (kode == 0) {
                break;
            }
            if (kode != 1 && kode != 2) {
                System.out.println("Kode kendaraan tidak valid.");
                continue;
            }

            System.out.print("Lama parkir (jam): ");
            jam = sc.nextInt();

            if (kode == 1) {
                totalBayar += jam * 3000;
            } else {
                totalBayar += jam * 2000;
            }

            System.out.println("Total pembayaran parkir: " + totalBayar);
        }

        sc.close();
    }
}