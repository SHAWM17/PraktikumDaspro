package jobsheet5;
import java.util.Scanner;
public class aksesWIFI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan nama pengguna: "); // dosen/mahasiswa
        String pengguna = sc.nextLine();
        if ("dosen".equalsIgnoreCase(pengguna)) {
            System.out.println("akses WIFI diberikan (dosen)");
        } else if ("mahasiswa".equalsIgnoreCase(pengguna)) {
            System.out.print("masukkan jumlah SKS: ");
            int sks = sc.nextInt();
            if (sks >= 12) {
                System.out.println("akses WIFI diberikan (mahasiswa)");
            } else {
                System.out.println("akses WIFI ditolak, jumlah SKS kurang dari 12");
            }
        } else {
            System.out.println("pengguna tidak dikenal, akses WIFI ditolak");
        }
        sc.close();
    }
}
