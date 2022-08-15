package Shipping;

public abstract class Person {
    private String id;
    private String nationalId;
    private String idType;
    private PersonType personType;
    private String name;
    private String email;
    private String lasName;
    private Location location;

    //Get and set methods

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLasName() {
        return lasName;
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }


    //Constructing method


    public Person(String id, String nationalId, String idType, PersonType personType, String name, String email, String lasName, Location location) {
        this.id = id;
        this.nationalId = nationalId;
        this.idType = idType;
        this.personType = personType;
        this.name = name;
        this.email = email;
        this.lasName = lasName;
        this.location = location;
    }

    public boolean biometricValidation(){
        return true;
    }
}
