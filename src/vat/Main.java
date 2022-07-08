package vat;


import java.util.*;


public class Main {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product(211.0, 0.0, 8.0, 23.0));
        products.add(new Product(300.0, 0.0, 8.0, 23.0));
        products.add(new Product(400.0, 0.0, 8.0, 23.0));
        products.add(new Product(600.0, 0.0, 8.0, 23.0));

        calculateVat(products);

    }

    public static void calculateVat(List<Product> products) {
        List<CalculatedListOfProduct> calculatedListOfProducts = new ArrayList<>();
        for (Product product : products) {
            double sum8vat = product.getPrice() * product.getVat8() / 100;
            double sum23vat = product.getPrice() * product.getVat23() / 100;
            double brutto8 = product.getPrice() + sum8vat;
            double brutto23 = product.getPrice() + sum23vat;
            calculatedListOfProducts.add(new CalculatedListOfProduct(product.getPrice(), 0, sum8vat, sum23vat, product.getPrice(), brutto8, brutto23));
        }
        //  calculatedListOfProducts.stream().map(CalculatedListOfProduct::getNettoPrice).mapToDouble()
    }


    public static class CalculatedListOfProduct {

        private double nettoPrice;
        private double sumVat0;
        private double sumVat8;
        private double sumVat23;
        double brutto0;
        double brutto8;
        double brutto23;

        public double getNettoPrice() {
            return nettoPrice;
        }

        public void setNettoPrice(double nettoPrice) {
            this.nettoPrice = nettoPrice;
        }

        public double getSumVat0() {
            return sumVat0;
        }

        public void setSumVat0(double sumVat0) {
            this.sumVat0 = sumVat0;
        }

        public double getSumVat8() {
            return sumVat8;
        }

        public void setSumVat8(double sumVat8) {
            this.sumVat8 = sumVat8;
        }

        public double getSumVat23() {
            return sumVat23;
        }

        public void setSumVat23(double sumVat23) {
            this.sumVat23 = sumVat23;
        }

        public double getBrutto0() {
            return brutto0;
        }

        public void setBrutto0(double brutto0) {
            this.brutto0 = brutto0;
        }

        public double getBrutto8() {
            return brutto8;
        }

        public void setBrutto8(double brutto8) {
            this.brutto8 = brutto8;
        }

        public double getBrutto23() {
            return brutto23;
        }

        public void setBrutto23(double brutto23) {
            this.brutto23 = brutto23;
        }

        public CalculatedListOfProduct(double nettoPrice, double sumVat0, double sumVat8, double sumVat23, double brutto0, double brutto8, double brutto23) {
            this.nettoPrice = nettoPrice;
            this.sumVat0 = sumVat0;
            this.sumVat8 = sumVat8;
            this.sumVat23 = sumVat23;
            this.brutto0 = brutto0;
            this.brutto8 = brutto8;
            this.brutto23 = brutto23;

        }


        @Override
        public String toString() {
            return "CalculatedListOfProduct{" +
                    "nettoPrice=" + nettoPrice +
                    ", sumVat0=" + sumVat0 +
                    ", sumVat8=" + sumVat8 +
                    ", sumVat23=" + sumVat23 +
                    ", brutto0=" + brutto0 +
                    ", brutto8=" + brutto8 +
                    ", brutto23=" + brutto23 +
                    '}';
        }
    }

}
