import java.util.Scanner;
public class Number03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = 28;
        int num2 = 54;
        int num3 = 15;

        System.out.print("num1: ");
        num1 = sc.nextInt();
        System.out.print("num2: ");
        num2 = sc.nextInt();
        System.out.print("num3: ");
        num3 = sc.nextInt();

        if (num1 > num3) {
            if (num1 > num2) {
                System.out.println("Result: " + num1);
            } else  {
                System.out.println("Result: " + num2);
            }
            } else if (num2 > num3) {
                System.out.println("Result: " + num2);
        }  else {
            System.out.println("Result: " + num3);
    }
}
}