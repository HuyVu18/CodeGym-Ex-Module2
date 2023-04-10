package lesson4.shopee;

import java.util.Scanner;

public class Category {
    String id;
    String name;
    String img;
    Product[] products;

    public Category(String id, String name, String img, Product[] products) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.products = products;
    }

//      public Category() {
//        this.id = "id";
//        this.name = "name";
//        this.img = "img";
//        this.products = new Product[3];
//    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public static int action() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bấm để lựa chọn: ");
        return sc.nextInt();
    }

    public void printProductsList() {
        String text = "";
        for (Product element : getProducts()) {
            text += element.getProductsList() + "\n";
        }
        System.out.println("Danh sách sản phẩm:");
        System.out.println(text);
        System.out.println("0. Thoát.");
        int select = action();
        while (true) {
            switch (select) {
                case 1, 2, 3, 4 -> System.out.println("Hết hàng");
                default -> {
                    return;
                }
            }
        }
    }
}
