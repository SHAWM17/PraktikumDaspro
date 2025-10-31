package jobsheet8;
public class ForKuadrat27 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){
            int jumlah = 0;
            String detailPerhitungan = " ";
            for (int j = 1; j <= i; j++){
                int hasil = j * j;
                jumlah+=hasil;
                if (j == 1) {
                    detailPerhitungan+=hasil;
                } else {
                    detailPerhitungan+= " + " + hasil;
                }
            }
            System.out.print("n = " + i + " ==> jumlah kuadrat = ");
            if (i == 1) {
                System.out.println(jumlah);
            } else {
                System.out.println(detailPerhitungan + " = " + jumlah);
            }
        }
    }
}