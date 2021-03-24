public class Candy extends Dessert{

    public Candy(double cost, double tax) {
        super(cost, tax);
    }

    @Override
    double getCost() {
        return super.getPrice() + super.getTax();
    }
}
