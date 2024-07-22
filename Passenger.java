import java.util.ArrayList;

public abstract class Passenger {

    private String name;
    private int ID;
    private Car reserved;
    private double trip_cost;
    private static ArrayList<Integer> ids = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) throws IllegalArgumentException {
        if (ids.contains(ID)) {
            throw new IllegalArgumentException("ID already exists");
        } else {
            ids.remove((Integer) this.ID);
            this.ID = ID;
            ids.add(ID);
        }
    }

    public double getTrip_cost() {
        return trip_cost;
    }

    public void setTrip_cost(double trip_cost) {
        this.trip_cost = trip_cost;
    }

    public Car getReserved() {
        return reserved;
    }

    public void setReserved(Car reserved) {
        this.reserved = reserved;
    }

    public Passenger() {
    }

    public Passenger(String name, int ID) throws IllegalArgumentException {
        if (ids.contains(ID)) {
            throw new IllegalArgumentException("ID already exists");
        }
        this.name = name;
        this.ID = ID;
        ids.add(ID);
    }

    public abstract void reserveCar(Car car) throws Exception;

    public void display() {
        System.out.println("Passenger Details:");
        System.out.println("Name:          " + name);
        System.out.println("ID:            " + ID);

    }
}
