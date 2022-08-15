package Shipping;

public class Delivery {
    private Order[] order;
    private DeliveryStatus status;
    private Track track;
    private Internal driver;
    private Position position;

    //Get and set methods

    public Order[] getOrder() {
        return order;
    }

    public void setOrder(Order[] order) {
        this.order = order;
    }

    public DeliveryStatus getStatus() {
        return status;
    }

    public void setStatus(DeliveryStatus status) {
        this.status = status;
    }

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    public Internal getDriver() {
        return driver;
    }

    public void setDriver(Internal driver) {
        this.driver = driver;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosicion(Position posicion) {
        this.position = position;
    }

    //Methods
    public Position watchPosicion(){
        return position;
    }
    public Position getCurrentPosicion(){
        return position;
    }
    private void setCurrentPosition(Position Position){
        System.out.printf("Position");
    }
}
