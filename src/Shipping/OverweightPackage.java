package Shipping;

public class OverweightPackage extends Package {
    private float overWeight;


    //Constructor
    public OverweightPackage(String _id, int _code, String _description, float _gramsPrice, float _basePrice, float _weight, float _overWeight) {
        super(_id, _code, _description, _gramsPrice, _basePrice, _weight);
        this.overWeight = _overWeight;
    }

    //Get and set methods

    public float getOverWeight() {
        return overWeight;
    }

    public void setOverWeight(float overWeight) {
        this.overWeight = overWeight;
    }

    public float calculate(float weight, float gramsPrice, float overWeight) {
        float grams = gramsPrice*overWeight;
        return (super.calculate(weight, gramsPrice))+grams;
    }
}
