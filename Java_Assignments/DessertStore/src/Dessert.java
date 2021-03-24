abstract class Dessert {

  private double price;
  private double tax;

    public Dessert(double price, double tax) {
        this.price = price;
        this.tax = tax;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    abstract double getCost();
}
