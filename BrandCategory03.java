import java.util.Scanner;
public class BrandCategory03 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String brand;
        String category;
        int size;
        double price;

       System.out.print("Enter the brand: ");
       brand = sc.nextLine();
       System.out.print("Enter the category: ");
       category = sc.nextLine();
       System.out.print("Enter the size: ");
       size = sc.nextInt();

       price = 0.0;

       if (brand.equalsIgnoreCase("converse")) {
           if (category.equalsIgnoreCase("high top shoes")) {
               if (size >= 40 && size <= 44) {
                   price = 1200000;
               } else if (size >= 36 && size <= 40) {
                   price = 800000;
               }
           }
       } else if (brand.equalsIgnoreCase("skechers")) {
           if (category.equalsIgnoreCase("woman")) {
               if (size >= 36 && size <= 41) {
                   price = 1000000;
               }
           } else if (category.equalsIgnoreCase("man")) {
               if (size >= 41 && size <= 44) {
                   price = 1800000;
               }
           }
       } else if (brand.equalsIgnoreCase("nike")) {
           if (category.equalsIgnoreCase("kids")) {
               if (size >= 36 && size <= 40) {
                   price = 750000;
               }
           } else if (category.equalsIgnoreCase("adult")) {
               if (size == 44) {
                   price = 1500000;
               }
           }
       }
       System.out.println("The price is: Rp " + price);
   }
    }

