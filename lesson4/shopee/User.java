package lesson4.shopee;

import java.util.Scanner;

public class User {
    Scanner sc = new Scanner(System.in);
    int id;
    String username;
    String password;
    String phone;
    public static Address address;

    public User(int id, String username, String password, String phone) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.address = new Address();
    }

    public User() {
        this.phone = "Không xác định.";
        this.address = new Address();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone() {
        System.out.println("Nhập số điện thoại:");
        this.phone = sc.nextLine();
        System.out.println("Cập nhật số điện thoại thành công!");
        printProfile();
    }

    public static int action() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bấm để lựa chọn: ");
        return sc.nextInt();
    }

    public void printLogin() {
        System.out.println("Vui lòng đăng nhập!");
        System.out.println("Tên đăng nhập:");
        this.username = sc.nextLine();
        System.out.println("Password:");
        this.password = sc.nextLine();
    }

    public void printProfile() {
        System.out.println("Thông tin của " + getUsername() + ":");
        System.out.println("Số điện thoại: " + getPhone());
        System.out.println("Địa chỉ: " + address.getAddress());
    }

    public void changeProfile() {
        printProfile();
        while (true) {
            System.out.println("Thay đổi thông tin.");
            System.out.println("1. Số điện thoại.");
            System.out.println("2. Địa chỉ.");
            System.out.println("0. Thoát.");
            int select = action();
            switch (select) {
                case 1 -> setPhone();
                case 2 -> {
                    address.setAddress();
                    printProfile();
                }
                default -> {
                    return;
                }
            }
        }
    }
}
