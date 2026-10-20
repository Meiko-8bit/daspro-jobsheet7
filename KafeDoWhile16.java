import java.util.Scanner;
public class KafeDoWhile16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kopi,teh,roti,totalHarga;
        String namaPelanggan;
        int hargaKopi = 12000,hargaTeh = 7000,hargaRoti = 20000;

        do{
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equals("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("jumlah roti: ");
            roti = sc.nextInt();

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total harga pesanan " + namaPelanggan + " adalah: Rp" + totalHarga);
            sc.nextLine();

        }while (true);
        sc.close();
    }
}
