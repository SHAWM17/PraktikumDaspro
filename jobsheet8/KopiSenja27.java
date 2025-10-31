package jobsheet8;
import java.util.Scanner;
public class KopiSenja27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah cabang: ");
        int cabang = sc.nextInt();
        int totalPendapatan = 0, totalPelanggan = 0;
        System.out.println("=== Input Penjualan Per Cabang ===");
        for (int i =1; i <= cabang; i++){
            System.out.print("--- Cabang "+ i + " ---\n");
            int jumlahPelanggan = 0, pendapatanCabang = 0;
            System.out.print("Masukkan jumlah pelanggan: ");
            jumlahPelanggan = sc.nextInt();
            for (int j = 1; j <= jumlahPelanggan; j++){
                System.out.print("Pelanggan ke-" + j + " memesan berapa item? ");
                int item = sc.nextInt();
                pendapatanCabang += item;
            }
            System.out.println("Cabang " + i + ":");
            System.out.println("Pelanggan: " + jumlahPelanggan);
            System.out.println("Item terjual: " + pendapatanCabang);
            totalPelanggan += jumlahPelanggan;
            totalPendapatan += pendapatanCabang;
        }
        System.out.println();
        System.out.println("Total Seluruh Cabang:");
        System.out.println("Pelanggan: " + totalPelanggan + " orang");
        System.out.println("Item terjual: " + totalPendapatan + " item");
        sc.close();
    }
}
