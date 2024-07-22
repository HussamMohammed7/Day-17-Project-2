public class Subscribers extends Passenger {

    public Subscribers() {
    }

    public Subscribers(String name, int ID) throws Exception {
        super(name, ID);

    }

    @Override

    public void reserveCar(Car car) throws Exception {
        try {
            double trip_cost = car.getFixed_route().getTrip_price() / 2;

            if (car.getMax_capacity() <= 0) {

                throw new Exception(getName() + " Cannot reserved , Car is at full capacity");

            }else {
                car.setMax_capacity(car.getMax_capacity() - 1);
                setReserved(car);
                setTrip_cost(trip_cost);
            }

        } catch (Exception e) {
            System.out.println(getName() + " Cannot reserve, Car is at full capacity");
        }

    }

    public void display() {
        System.out.println("----------------------------------------------");
        System.out.println("Subscription Type : Subscriber");
        System.out.println("Passenger Details:");
        System.out.println("Name:          " + getName());
        System.out.println("ID:            " + getID());
        System.out.println("50% discount!!");

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
