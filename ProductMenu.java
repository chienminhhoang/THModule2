package THM2;

import java.util.Scanner;

public class ProductMenu {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("1.Display list product");
            System.out.println("2.Add product");
            System.out.println("3.Update product");
            System.out.println("4.remove product");
            System.out.println("5.Sorting product");
            System.out.println("6.Find the product with the highest price");
            System.out.println("7.Read to file");
            System.out.println("8.Write to file");
            System.out.println("9.Exit");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    productManager.displayAllProduct();
                    break;
                case 2:
                    productManager.addProduct();
                    break;
                case 3:
                    productManager.updateById();
                    break;
                case 4:
                    productManager.removeById();
                    break;
                case 5:
                    productManager.sortProduct();
                    break;
                case 6:
                    System.out.println("I can't do it");
                    break;
                case 7:
                    System.out.println("I can't do it");
                    break;
                case 8:
                    System.out.println("I can't do it");
                    break;
                default:
                    break;
            }

        }

    }

}
