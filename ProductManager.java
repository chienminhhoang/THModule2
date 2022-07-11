package THM2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager implements Serializable {
    ArrayList<Product> products = new ArrayList<>();
//    IOFile fileIO;
    public void displayAllProduct(){
        for (Product p :products)
              {
                  System.out.println(products);

        }

//        products =fileIO.readDataFromFile("Product.txt");
    }

    public void addProduct(){
        Product product = createProduct();
        products.add(product);
//        fileIO.writeDataToFile(products,"Product.txt");

    }
    public Product createProduct(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id");
        int id = scanner.nextInt();
        System.out.println("Enter name");
        String name = scanner.next();
        scanner.nextLine();
        System.out.println("Enter number");
        int number =scanner.nextInt();
        System.out.println("Enter price");
        int price = scanner.nextInt();
        System.out.println("Enter description");
        String description = scanner.next();
        scanner.nextLine();
        return new Product(id,name,number,price,description);
    }
    public void updateById(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id product want to update");
        int id = scanner.nextInt();
        for (int i = 0; i <products.size() ; i++) {
            if(products.get(i).id == id ){
                Product product = createProduct();
                products.set(i,product);
//                fileIO.writeDataToFile(products,"Product.txt");

            } else if (products.get(i).id != id){
                System.out.println("can't find id, re-enter id pls");
            }

        }
    }
    public void removeById(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id product want to update");
        int id = scanner.nextInt();
        for (int i = 0; i <products.size() ; i++) {
            if(products.get(i).id == id ){
               products.remove(i);
            }

        }

    }
    public void sortProduct(){}
    public void searchByHighPrice(){

    }
}

