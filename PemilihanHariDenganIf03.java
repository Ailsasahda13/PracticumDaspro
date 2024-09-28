import java.util.Scanner;
public class PemilihanHariDenganIf03 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Deklarasi variabel
        int number;

        System.out.print("Masukkan nomor 1-7: ");
        number = sc.nextInt();

        if (number >= 1 && number <=7) {
            if (number <= 5){
                System.out.println("weekday");
            } else {
                System.out.println("weekend");
            } 
            }  else {
                System.out.println("invalid number");
            }
        }
    }
    
