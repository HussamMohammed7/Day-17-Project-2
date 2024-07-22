public class NonSubscribers extends Passenger {


    private boolean discountCoupon;

    public NonSubscribers(String name, int ID, boolean discountCoupon)throws Exception {
        super(name, ID);
        this.discountCoupon = discountCoupon;
    }

    @Override
    public void reserveCar(Car car) throws Exception {
        try {
            if (car.getMax_capacity() <= 0) {
                throw new Exception(getName() + " Cannot reserved , Car is at full capacity");

            }else {
                double trip_cost = car.getFixed_route().getTrip_price();

                car.setMax_capacity(car.getMax_capacity() - 1);

                if (discountCoupon) {
                    trip_cost = trip_cost - (car.getFixed_route().getTrip_price() * 0.1);
                }
                setReserved(car);

                setTrip_cost(trip_cost);
            }
        }catch (Exception e) {
            System.out.println(getName() + " Cannot reserve, Car is at full capacity");

        }


    }
    public void display() {
        System.out.println("----------------------------------------------");
        System.out.println("Subscription Type : NonSubscribers");

        System.out.println("Passenger Details:");
        System.out.println("Name:          " + getName());
        System.out.println("ID:            " + getID());
        if (discountCoupon) {
            System.out.println("Coupon discount is : 10%");
            System.out.println("Enjoy your discount coupon");
        }else {
            System.out.println("Doesn't have Coupon ");

        }

        if (getReserved() != null) {
            System.out.println("Reserved Car:  " + getReserved().getCode());
            System.out.println("Route Price:   " + getReserved().getFixed_route().getTrip_price());
            System.out.println("Trip Cost:     " + getTrip_cost());
            System.out.println("_______________________________________");
        } else {
            System.out.println("No car reserved.");
        }
    }
}
