public class Orders {

    private int orderSize;
    private String orderStatus;

    public Orders(int orderSize, String orderStatus) {
        this.orderSize = orderSize;
        this.orderStatus = orderStatus;
    }

    public int getOrderSize() {
        return orderSize;
    }

    public void setOrderSize(int orderSize) {
        this.orderSize = orderSize;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderSize=" + orderSize +
                ", orderStatus='" + orderStatus + '\'' +
                '}';
    }
}
