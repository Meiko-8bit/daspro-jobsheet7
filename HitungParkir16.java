import java.util.Scanner;
public class HitungParkir16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jamMasuk, jamKeluar, durasiParkir;
        double tarifParkir, totalPendapatan = 0;

        do {
            System.out.print("Masukkan jam masuk (0-23): ");
            jamMasuk = sc.nextInt();
            System.out.print("Masukkan jam keluar (0-23): ");
            jamKeluar = sc.nextInt();

            if (jamMasuk < 0 || jamMasuk > 23 || jamKeluar < 0 || jamKeluar > 23) {
                System.out.println("Jam masuk atau keluar tidak valid. Silakan masukkan ulang!");
                continue;
            }

            if (jamKeluar < jamMasuk) {
                System.out.println("Jam keluar tidak boleh lebih kecil dari jam masuk. Silakan masukkan ulang!");
                continue;
            }

            durasiParkir = jamKeluar - jamMasuk;

            if (durasiParkir <= 1) {
                tarifParkir = 2000;
            } else if (durasiParkir <= 3) {
                tarifParkir = 2000 + (durasiParkir - 1) * 1000;
            } else {
                tarifParkir = 4000 + (durasiParkir - 3) * 500;
            }

            totalPendapatan += tarifParkir;

            System.out.println("Durasi parkir: " + durasiParkir + " jam");
            System.out.println("Tarif parkir: Rp" + tarifParkir);
            System.out.println("Total pendapatan: Rp" + totalPendapatan);

        } while (true);
    }
}
