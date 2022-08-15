package Shipping;

public class StandardPackage extends Package{
    private float quota;

    //Constructor
    public StandardPackage(String _id, int _code, String _description, float _gramsPrice, float _basePrice, float _weight, float _quota) {
        super(_id, _code, _description, _gramsPrice, _basePrice, _weight);
        this.quota = _quota;
    }

    //Get and set methods
    public float getQuota() {
        return quota;
    }

    public void setQuota(float quota) {
        this.quota = quota;
    }

    public float calculate(float weight, float gramsPrice, float quota) {
        return (super.calculate(weight, gramsPrice)) * quota;
    }

    @Override
    public String toString() {
        return "StandardPackage{" +
                "quota=" + quota +
                '}';
    }
}
