package geekbrains.homeworks.homework1;

import java.util.List;

public class Category {
    private String name;
    private List<Product> products;

    public Category(String name, List<Product> products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    @Override
    public String toString() {
        StringBuilder productsStr = new StringBuilder();

        for (Product product : products) {
            productsStr.append("\n\t").append(product);
        }

        return name + ':' + productsStr;
    }
}
