import java.util.Scanner;
/**
 * PemilihanBilangan03
 */
public class PemilihanBilangan03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
       
        int angka;

        System.out.print("Masukkan angka: ");
        angka  = sc.nextInt();

        String hasil;
        hasil = (angka % 2 == 0) ? "termasuk bilangan genap" : "termasuk bilangan ganjil";
        System.out.println(hasil);
        }
    }



