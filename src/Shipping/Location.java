package Shipping;

public class Location {
    private String country;
    private String state;
    private String city;
    private String addresLine1;
    private String addresLine2;
    private int zipCode;

    //Get and set methods


    public String getCountry() {
        return country;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddresLine1() {
        return addresLine1;
    }

    public void setAddresLine1(String addresLine1) {
        this.addresLine1 = addresLine1;
    }

    public String getAddresLine2() {
        return addresLine2;
    }

    public void setAddresLine2(String addresLine2) {
        this.addresLine2 = addresLine2;
    }

    public int getZipCode() {
        return zipCode;
    }

    public Location(String country, String state, String city, String addresLine1, String addresLine2, int zipCode) {
        this.country = country;
        this.state = state;
        this.city = city;
        this.addresLine1 = addresLine1;
        this.addresLine2 = addresLine2;
        this.zipCode = zipCode;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Location{" +
                "country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", addresLine1='" + addresLine1 + '\'' +
                ", addresLine2='" + addresLine2 + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
