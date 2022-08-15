package Shipping;

public class Internal extends Person{
    private Role role;
    private BankAccount account;

    public Internal(String id, String nationalId, String idType, PersonType personType, String name, String email, String lasName, Location location) {
        super(id, nationalId, idType, personType, name, email, lasName, location);
    }


    //Get and set methods

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

    public BankAccount getAccount() {
        return account;
    }

    @Override
    public boolean biometricValidation() {
        return super.biometricValidation();
    }
}
