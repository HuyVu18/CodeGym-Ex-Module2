package lesson4.shopee;

public class Main {
    public static User newUser = new User();
    public static Product[] products1 = productsList1();
    public static Category newCategory1 = new Category("I", "Điện thoại di động.", "img", products1);

    public static Product[] products2 = productsList2();
    public static Category newCategory2 = new Category("II", "Laptop.", "img", products2);

    public static void printCategoryList() {
        System.out.println("Chọn danh mục sản phẩm:");
        System.out.println("1. " + newCategory1.getName());
        System.out.println("2. " + newCategory2.getName());
        System.out.println("0. Thoát.");
        int select = newUser.action();
        switch (select) {
            case 1 -> {
                newCategory1.printProductsList();
                printCategoryList();
            }
            case 2 -> {
                newCategory2.printProductsList();
                printCategoryList();
            }
            default -> {
                return;
            }
        }
    }

    public static Product[] productsList1() {
        Product[] products = new Product[4];
        products[0] = new Product("1", "Iphone", 1500);
        products[1] = new Product("2", "Samsung", 1000);
        products[2] = new Product("3", "BlackBerry", 1300);
        products[3] = new Product("4", "Nokia", 900);
        return products;
    }

    public static Product[] productsList2() {
        Product[] products = new Product[4];
        products[0] = new Product("1", "Macbook", 2000);
        products[1] = new Product("2", "Acer", 1800);
        products[2] = new Product("3", "Dell", 1700);
        products[3] = new Product("4", "HP", 1600);
        return products;
    }

    public static void printMenu() {
        System.out.println("1. Thông tin người dùng.");
        System.out.println("2. Danh sách sản phẩm.");
        System.out.println("3. Giỏ hàng.");
        System.out.println("4. Đơn hàng.");
        System.out.println("0. Thoát.");
    }

    public static void main(String[] args) {
        newUser.printLogin();
        while (true) {
            printMenu();
            int select = newUser.action();
            switch (select) {
                case 1 -> newUser.changeProfile();
                case 2 -> printCategoryList();
                default -> {
                    return;
                }
            }
        }
    }
}
