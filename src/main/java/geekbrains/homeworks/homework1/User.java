package geekbrains.homeworks.homework1;

import java.util.List;

public class User {
    private String login;
    private String password;
    private Basket basket;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.basket = new Basket();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public void buyProduct(List<Category> categories, Product product) {
        for (Category category : categories) {
            for (int j = 0; j < category.getProducts().size(); j++) {
                if (category.getProducts().get(j).equals(product)) {
                    this.basket.addProduct(category.getProducts().remove(j));
                    return;
                }
            }
        }

        System.out.println("ERROR: Product \"" + product.getName() + "\" not found");
    }

    public void buyProduct(List<Category> categories, String product) {
        for (Category category : categories) {
            for (int j = 0; j < category.getProducts().size(); j++) {
                if (category.getProducts().get(j).getName().equals(product)) {
                    this.basket.addProduct(category.getProducts().remove(j));
                    return;
                }
            }
        }

        System.out.println("ERROR: Product \"" + product + "\" not found");
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", basket=" + basket +
                '}';
    }
}
