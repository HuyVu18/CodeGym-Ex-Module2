package lesson4.shopee;

public class CartLine {
    int id;
    int productid;
    int quantity;
    double totalprice;

    public CartLine(int id, int productid, int quantity, double totalprice) {
        this.id = id;
        this.productid = productid;
        this.quantity = quantity;
        this.totalprice = totalprice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(double totalprice) {
        this.totalprice = totalprice;
    }
}
