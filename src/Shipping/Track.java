package Shipping;

public class Track {
    private String id;
    private TrackType type;
    private float maxWeight;
    private float currentWeight;
    private TrackStatus status;

    //Get and set methods
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TrackType getType() {
        return type;
    }

    public void setType(TrackType type) {
        this.type = type;
    }

    public float getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(float maxWeight) {
        this.maxWeight = maxWeight;
    }

    public float getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(float currentWeight) {
        this.currentWeight = currentWeight;
    }

    public TrackStatus getStatus() {
        return status;
    }

    public void setStatus(TrackStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Track{" +
                "id='" + id + '\'' +
                ", type=" + type +
                ", maxWeight=" + maxWeight +
                ", currentWeight=" + currentWeight +
                ", status=" + status +
                '}';
    }
}
