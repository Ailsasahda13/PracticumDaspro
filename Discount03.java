import java.util.Scanner;
public class Discount03 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String bookCategory;
        int amountBook;
        String anotherString;

        System.out.print("enter a book category: ");
        bookCategory =  sc.nextLine();
        System.out.print("enter the amount of books: ");
        amountBook = sc.nextInt();
        double discount = 0;
        if (bookCategory.equalsIgnoreCase("dictionary")) {
            discount = 0.1;
            if (amountBook >=2) {
                discount += 0.02;
            }
        } else if (bookCategory.equalsIgnoreCase("novel")) {
            discount = 0.07;
            if (amountBook >= 3) {
                discount += 0.02;
            }  else if (amountBook >= 2) {
                discount += 0.01;
            } else if (amountBook >= 3) {
                discount = 0.05;
            }
        } else {
            System.out.println("Invalid book category");
        }
        System.out.print("Diskon: " + discount * 100 + "%");
    }
}


