package lesson12.productManager;

import java.util.ArrayList;

public class ProductManager {
    private ArrayList<Product> element = new ArrayList<>();


    public void add(int id, String name, double price) {
        element.add(new Product(id, name, price));
    }

    public void getALl() {
        for (Product e : element) {
            System.out.println(e);
        }
    }

    public void setInfo(int id, String name, double price) {
        for (Product e : element) {
            if (e.getId() == id) {
                e.setName(name);
                e.setPrice(price);
            }
        }
    }

    public void del(int id) {
        for (Product e : element) {
            if (e.getId() == id) {
                element.remove(id - 1);
                break;
            }
        }
    }

    public void searchName(String name) {
        ArrayList<Product> result = new ArrayList<>();
        for (Product e : element) {
            if (e.getName().equals(name)) {
                result.add(e);
                System.out.println(result);
            }
        }
    }

    public void sortProduct() {
        PriceComparator comparator = new PriceComparator();
        element.sort(comparator);
    }
}
