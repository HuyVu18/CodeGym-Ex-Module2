package lesson4.shopee;

import java.util.Date;

public class Order {
    int id;
    boolean status;
    double totalprice;
    String addres;
    String receiver;
    Date time;

    public Order(int id, boolean status, double totalprice, String addres, String receiver, Date time) {
        this.id = id;
        this.status = status;
        this.totalprice = totalprice;
        this.addres = addres;
        this.receiver = receiver;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(double totalprice) {
        this.totalprice = totalprice;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
