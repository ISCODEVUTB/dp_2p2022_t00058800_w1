package Shipping;

public class Order {
    private String id;
    private Package Package;
    private boolean paid;
    private float price;
    private Customer receiver;
    private Customer sender;
    private OrderStatus status;
    private Location location;

    //Get and set methods
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Shipping.Package getPackage() {
        return Package;
    }

    public void setPackage(Shipping.Package aPackage) {
        Package = aPackage;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Order(String id, Shipping.Package aPackage, boolean paid, float price, Customer receiver, Customer sender, OrderStatus status, Location location) {
        this.id = id;
        Package = aPackage;
        this.paid = paid;
        this.price = price;
        this.receiver = receiver;
        this.sender = sender;
        this.status = status;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", Package=" + Package +
                ", paid=" + paid +
                ", price=" + price +
                ", receiver=" + receiver +
                ", sender=" + sender +
                ", status=" + status +
                ", location=" + location +
                '}';
    }
}
