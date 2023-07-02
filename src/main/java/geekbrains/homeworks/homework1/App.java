package geekbrains.homeworks.homework1;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Product product1 = new Product("Phone", 180., 5);
        Product product2 = new Product("Tablet", 200., 3);
        Product product3 = new Product("Tomato", 50.5, 4);
        Product product4 = new Product("Chair", 150., 1);
        Product product5 = new Product("Table", 250.99, 3);
        Product product6 = new Product("Couch", 450.99, 4);

        List<Category> categories = new ArrayList<>(List.of(
                new Category("Informatica", new ArrayList<>(List.of(
                        product1,
                        product2
                ))),
                new Category("Food", new ArrayList<>(List.of(
                        product3
                ))),
                new Category("Furniture", new ArrayList<>(List.of(
                        product4,
                        product5,
                        product6
                )))
        ));

        for (Category category : categories) {
            System.out.println(category);
        }

        User user1 = new User("test1", "12345678");
        User user2 = new User("test2", "87654321");

        user1.buyProduct(categories, product1);
        user1.buyProduct(categories, "Table");
        user2.buyProduct(categories, "Chair");
        user2.buyProduct(categories, product1);
        user2.buyProduct(categories, "Product not exists");

        System.out.println("After buying product");
        System.out.println(user1);
        for (Category category : categories) {
            System.out.println(category);
        }
    }
}
