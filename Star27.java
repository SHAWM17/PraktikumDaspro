import java.util.Scanner;
public class Star27 {
    public static void main (String[] main){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.print("*");
        }
        sc.close();
    }
}