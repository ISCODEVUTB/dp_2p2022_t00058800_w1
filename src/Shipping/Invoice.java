package Shipping;

import java.util.Arrays;

public class Invoice {
    private String id;
    private Order[] orders;
    private InvoiceStatus status;
    private Customer client;
    private float tax;
    private float price;
    private float discoint;
    private PaymentMethodsType paymentMethod;

    //Get and set methods
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Order[] getOrders() {
        return orders;
    }

    public void setOrders(Order[] orders) {
        this.orders = orders;
    }

    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getDiscoint() {
        return discoint;
    }

    public void setDiscoint(float discoint) {
        this.discoint = discoint;
    }

    public Invoice(String id, Order[] orders, InvoiceStatus status, Customer client, float tax, float price, float discoint, PaymentMethodsType paymentMethod) {
        this.id = id;
        this.orders = orders;
        this.status = status;
        this.client = client;
        this.tax = tax;
        this.price = price;
        this.discoint = discoint;
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id='" + id + '\'' +
                ", orders=" + Arrays.toString(orders) +
                ", status=" + status +
                ", client=" + client +
                ", tax=" + tax +
                ", price=" + price +
                ", discoint=" + discoint +
                ", paymentMethod=" + paymentMethod +
                '}';
    }
}
