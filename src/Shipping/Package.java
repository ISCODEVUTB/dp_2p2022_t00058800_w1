package Shipping;

public abstract class Package {
    private String id;
    private int code;
    private String description;
    private float gramsPrice;
    private float basePrice;
    private float weight;
    private Customer customer;

    //get and set methods
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getGramsPrice() {
        return gramsPrice;
    }

    public void setGramsPrice(float gramsPrice) {
        this.gramsPrice = gramsPrice;
    }

    public float getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(float basePrice) {
        this.basePrice = basePrice;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    //Constructing method
    public Package(String _id, int _code, String _description, float _gramsPrice, float _basePrice, float _weight){
        this.id = _id;
        this.code = _code;
        this.description = _description;
        this.gramsPrice = _gramsPrice;
        this.basePrice = _basePrice;
        this.weight = _weight;
    }
    public float calculate(float weight, float gramsPrice){
        return weight*gramsPrice;
    }

    @Override
    public String toString() {
        return "Package{" +
                "id='" + id + '\'' +
                ", code=" + code +
                ", description='" + description + '\'' +
                ", gramsPrice=" + gramsPrice +
                ", basePrice=" + basePrice +
                ", weight=" + weight +
                '}';
    }

}
