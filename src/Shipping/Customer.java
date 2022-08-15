package Shipping;

import java.util.Arrays;

public class Customer extends Person {
    private Invoice[] invoices;
    private CreditCard creditCard;
    private Location[] shipping;

    public Customer(String id, String nationalId, String idType, PersonType personType, String name, String email,
                    String lasName, Location location, Invoice[] invoices,CreditCard creditCard,Location[] shipping) {
        super(id, nationalId, idType, personType, name, email, lasName, location);
        this.invoices = invoices;
        this.creditCard = creditCard;
        this.shipping = shipping;

    }


    //Get and set methods

    public Invoice[] getInvoices() {
        return invoices;
    }

    public void setInvoices(Invoice[] invoices) {
        this.invoices = invoices;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public Location[] getShipping() {
        return shipping;
    }

    public void setShipping(Location[] shipping) {
        shipping = shipping;
    }

    @Override
    public boolean biometricValidation() {
        return super.biometricValidation();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "invoices=" + Arrays.toString(invoices) +
                ", creditCard=" + creditCard +
                ", shipping=" + Arrays.toString(shipping) +
                '}';
    }
}
