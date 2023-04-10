package lesson4.shopee;

import java.util.Scanner;

public class Address {
    Scanner sc = new Scanner(System.in);
    String number;
    String street;
    String district;
    String city;

    public Address(String number, String street, String district, String city) {
        this.number = number;
        this.street = street;
        this.district = district;
        this.city = city;
    }

    public Address() {
        this.number = "không xác định";
        this.street = "không xác định";
        this.district = "không xác định";
        this.city = "không xác định";
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return "Số nhà " + getNumber() +
                ", Đường " + getStreet() +
                ", Quận " + getDistrict() +
                ", Thành phố " + getCity() + ".";
    }

    public void setAddress() {
        System.out.println("Nhập số nhà:");
        this.number = sc.nextLine();
        System.out.println("Nhập tên đường:");
        this.street = sc.nextLine();
        System.out.println("Nhập tên Quận:");
        this.district = sc.nextLine();
        System.out.println("Nhập tên thành phố:");
        this.city = sc.nextLine();
        System.out.println("Cập nhật địa chỉ thành công!");
    }
}
