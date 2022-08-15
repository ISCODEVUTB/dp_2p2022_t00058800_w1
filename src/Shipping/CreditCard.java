package Shipping;

import java.util.Date;

public class CreditCard {
    private String cvv;
    private String expiryYear;
    private String expiryMoth;
    private Date expiryDate;
    private int number;
    private int zipCode;


    //get and set methods

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getExpiryYear() {
        return expiryYear;
    }

    public void setExpiryYear(String expiryYear) {
        this.expiryYear = expiryYear;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getExpiryMoth() {
        return expiryMoth;
    }

    public void setExpiryMoth(String expiryMoth) {
        this.expiryMoth = expiryMoth;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public boolean validation(){
        return true;
    }

    public CreditCard(String cvv, String expiryYear, String expiryMoth, Date expiryDate, int number, int zipCode) {
        this.cvv = cvv;
        this.expiryYear = expiryYear;
        this.expiryMoth = expiryMoth;
        this.expiryDate = expiryDate;
        this.number = number;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cvv='" + cvv + '\'' +
                ", expiryYear='" + expiryYear + '\'' +
                ", expiryMoth='" + expiryMoth + '\'' +
                ", expiryDate=" + expiryDate +
                ", number=" + number +
                ", zipCode=" + zipCode +
                '}';
    }
}
