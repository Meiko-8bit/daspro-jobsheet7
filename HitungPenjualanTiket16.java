import java.util.Scanner;
public class HitungPenjualanTiket16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tiket= 0,jumlahTiket = 0,totalTiket = 0,hargaTiket = 50000;
        double bayar = 0,diskon = 0,totalPenjualan = 0;

        do{
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket <= 0) {
                System.out.println("Silakan masukkan ulang dengan jumlah tiket yang valid!");
                continue;
            }
            if (jumlahTiket > 4 && jumlahTiket <= 10) {
                tiket = jumlahTiket;
                diskon = hargaTiket * tiket * 0.1;
                bayar = (tiket * hargaTiket) - diskon;
                System.out.println("Total harga tiket yang harus dibayar: Rp" + bayar + " (Diskon: Rp" + diskon + ")");
                totalTiket += tiket;
                totalPenjualan += bayar;
                System.out.println("Total tiket yang terjual: " + totalTiket);
                System.out.println("Total penjualan: Rp" + totalPenjualan);
                tiket = 0;
            }
            if (jumlahTiket > 10) {
                tiket = jumlahTiket;
                diskon = hargaTiket * tiket * 0.15;
                bayar = (tiket * hargaTiket) - diskon;
                System.out.println("Total harga tiket yang harus dibayar: Rp" + bayar + " (Diskon: Rp" + diskon + ")");
                totalTiket += tiket;
                totalPenjualan += bayar;
                System.out.println("Total tiket yang terjual: " + totalTiket);
                System.out.println("Total penjualan: Rp" + totalPenjualan);
                tiket = 0;
            }
            if (jumlahTiket <= 4) {
                tiket = jumlahTiket;
                diskon = hargaTiket * tiket * 0;
                bayar = (tiket * hargaTiket) - diskon;
                System.out.println("Total harga tiket yang harus dibayar: Rp" + bayar + " (Diskon: Rp" + diskon + ")");
                totalTiket += tiket;
                totalPenjualan += bayar;
                System.out.println("Total tiket yang terjual: " + totalTiket);
                tiket = 0;

            }
  
        }while (true);

    }
}
