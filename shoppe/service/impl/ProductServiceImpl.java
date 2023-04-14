package shoppe.service.impl;

import shoppe.entity.Product;
import shoppe.service.CategoryService;

import java.util.ArrayList;

public class ProductServiceImpl implements CategoryService {
    private static ArrayList<Product> products = new ArrayList<>();

    public static void add() {
        products.add(new Product("1", "1","Shirt", 200));
        products.add(new Product("1", "2", "Coat", 500));
        products.add(new Product("1", "3", "Jean", 300));
    }

    public static void getAll() {
        for (Product element : products) {
            System.out.println(element);
        }
    }
}
