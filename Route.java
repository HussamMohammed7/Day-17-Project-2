public class Route {


    private String pickUp_address;
    private String destination_address;
    private double trip_price;

    public Route() {


    }

    public Route(String pickUp_address, String destination_address, double trip_price) {
        this.pickUp_address = pickUp_address;
        this.destination_address = destination_address;
        this.trip_price = trip_price;
    }

    public String getPickUp_address() {
        return pickUp_address;
    }

    public void setPickUp_address(String pickUp_address) {
        this.pickUp_address = pickUp_address;
    }

    public String getDestination_address() {
        return destination_address;
    }

    public void setDestination_address(String destination_address) {
        this.destination_address = destination_address;
    }

    public double getTrip_price() {
        return trip_price;
    }

    public void setTrip_price(double trip_price) {
        this.trip_price = trip_price;
    }


}
