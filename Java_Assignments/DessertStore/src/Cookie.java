public class Cookie extends Dessert{

    public Cookie(double cost, double tax) {
        super(cost, tax);
    }

    @Override
    double getCost() {
        return super.getPrice() + super.getTax();
    }
}
