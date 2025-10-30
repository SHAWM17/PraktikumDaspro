package jobsheet5;
import java.util.Scanner;

public class ifCetakKRS28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Cetak KRS SIAKAD---");
        System.out.print("apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();
        String pesan;
        pesan = uktLunas ? "pembayaran UKTterverifikasi\nSilakan cetak KRS dan minta tanda tangan DPA" : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu\n";
        System.out.println(pesan);

        if (uktLunas) {
            System.out.println("pembayaran UKTterverifikasi");
            System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");
        } else {
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
        }
        sc.close();
    }
}
