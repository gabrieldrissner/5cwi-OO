package Shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gui {
    private List<Product> procucts = new ArrayList<Product>();

    private Scanner scanner = new Scanner(System.in);

    public void addProduct(Product product) {
        this.procucts.add(product);
    }

    public void run() {
        while (true) {
            System.out.println("1 Alle Produkte");
            System.out.println("2 Alle Schuhe");
            System.out.println("3 Alle Oberteile");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    showProducts();
                    break;

                case 2:
                    showShoes();
                    break;

                    case 3:
                    showTops();
                    break;

                default:
                    break;
            }

        }
    }

    private void showProducts() {
        System.out.println("Alle Produkte");
        for (Product product : procucts) {
            System.out.println("Name: " + product.getName());
        }

    }

    private void showShoes() {
        System.out.println("Alle Schuhe");
        for (Product product : procucts) {
            if (product.getCategory() == Product.Category.SHOES) {
                System.out.println("Name: " + product.getName());
            }

        }
    }

    private void showTops() {
        System.out.println("Alle Oberteile");
        for (Product product : procucts) {
            if (product.getCategory() == Product.Category.TOP) {
                System.out.println("Name: " + product.getName());
            }

        }
    }
}