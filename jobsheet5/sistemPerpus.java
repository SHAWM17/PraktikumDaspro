package jobsheet5;
import java.util.Scanner;
public class sistemPerpus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Punya kartu mahasiswa? (true/false): ");
        boolean adaKartuMahasiswa = sc.nextBoolean();
        System.out.print("sudah registrasi? (true/false): ");
        boolean sudahRegistrasi = sc.nextBoolean();

        if (adaKartuMahasiswa || sudahRegistrasi) {
            System.out.println("Silakan masuk");
        } else {
            System.out.println("Akses ditolak");
        }
        sc.close();
    }
}
