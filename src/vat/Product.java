package vat;

public class Product {

    double price;
    double vat0;
    double vat8;
    double vat23;


    public Product(double price, double vat0, double vat8, double vat23) {
        this.price = price;
        this.vat0 = vat0;
        this.vat8 = vat8;
        this.vat23 = vat23;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getVat0() {
        return vat0;
    }

    public void setVat0(double vat0) {
        this.vat0 = vat0;
    }

    public double getVat8() {
        return vat8;
    }

    public void setVat8(double vat8) {
        this.vat8 = vat8;
    }

    public double getVat23() {
        return vat23;
    }

    public void setVat23(double vat23) {
        this.vat23 = vat23;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", vat0=" + vat0 +
                ", vat8=" + vat8 +
                ", vat23=" + vat23 +
                '}';
    }
}
