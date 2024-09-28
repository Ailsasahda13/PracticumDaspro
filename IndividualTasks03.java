import java.util.Scanner;
public class IndividualTasks03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rangeDistance;
        System.out.println("input rangeDistance: ");
        rangeDistance = sc.nextInt();

            if (rangeDistance <= 5) {
                System.out.println("melee weapon ");
            } else {
                System.out.println("ranged weapon ");
            }
            }
}
