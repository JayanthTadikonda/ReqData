public class IceCream extends Dessert{

    public IceCream(double cost, double tax) {
        super(cost, tax);
    }

    @Override
    double getCost() {
        return super.getPrice() + super.getTax();
    }
}
