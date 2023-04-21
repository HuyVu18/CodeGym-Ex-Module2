package lesson12.productManager;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ProductManager productList = new ProductManager();

        productList.add(1, "Shirt", 200);
        productList.add(2, "Pan", 150);
        productList.add(3, "Shoes", 300);
        productList.add(4, "Belt", 100);
        productList.getALl();

        System.out.println("-----");
        productList.setInfo(2, "Underwear", 20);

        productList.del(1);
        productList.getALl();

        System.out.println("-----");
        productList.searchName("Belt");

        System.out.println("-----");
        productList.sortProduct();
        productList.getALl();
    }
}
