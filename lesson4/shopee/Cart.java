package lesson4.shopee;

public class Cart {
    int id;
    double totalprice;

    public Cart(int id, double totalprice) {
        this.id = id;
        this.totalprice = totalprice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(double totalprice) {
        this.totalprice = totalprice;
    }
}
