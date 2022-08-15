package Shipping;
import java.util.Date;

class Main {
    public static void main(String[] args) {
        //An instance of standard Package is created
        StandardPackage standartP = new StandardPackage("1",12,"play5",20,200,314,5);

        //An instance of credit card is created
        CreditCard creditCard = new CreditCard("343","2022","12",new Date(2022,05,01,12,0,0),43243,1200);

        //an arrayList of orders is created which will then be used to create an invoice
        Order[] orders = new Order[1];

        //an arrayList of invoices is created that will later be used to create a customer
        Invoice[] invoices = new Invoice[1];

        //an arrayList of locations is created where a customer may have many addresses
        Location[] locations = new Location[1];

        //an instance of location is created
        Location location = new Location("Colombia","bolivar","Cartagena","pie de la popa","",23);

        //the customer instance is created and we pass it as a parameter credit card, the arrayList of invoices and location
        Customer customer = new Customer("58800","2","c",PersonType.NATURAL,"Iván",
                "ivan@gmail.com","Zapata",location,invoices,creditCard,locations);

        //Having instantiated all of the above, we can create an order
        Order order = new Order("id",standartP,true,100,customer,customer,OrderStatus.PENDING,location);

        //the order is added to the arraylist orders
        orders[0] = order;

        //the location is added to the arrayList locations
        locations[0] = location;

        //the invoice is instantiated
        Invoice invoice = new Invoice("123",orders,InvoiceStatus.PROCESSING,customer,2,500,5,PaymentMethodsType.CASH);


        //the created invoice is printed
        System.out.printf(""+invoice);
    }
}
