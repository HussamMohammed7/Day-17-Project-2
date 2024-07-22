//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        Route route1 = new Route("almonsiah", "alhmra", 200);
        Route route2 = new Route("alrawabi", "alnseem", 100);
        Route route3 = new Route("ryiadh", "dammam", 500);
        Route route4 = new Route("jeddah", "makkah", 900);

        Car car1 = new Car("car1", route1, 5);
        Car car2 = new Car("car2", route2, 3);
        Car car3 = new Car("car3", route3, 1);
        Car car4 = new Car("car4", route4, 0);


        Passenger[] passengers = new Passenger[4];
        try {


            try {
                passengers[0] = new Subscribers("hussam", 1);
                passengers[1] = new NonSubscribers("mohammed", 2, true);
                passengers[2] = new NonSubscribers("ali", 3, false);
                passengers[3] = new NonSubscribers("abduallah", 4, false);





                passengers[0].reserveCar(car1);
                passengers[1].reserveCar(car2);
                passengers[3].reserveCar(car4);
                passengers[2].reserveCar(car3);


            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("You exceed the limit of the array " + e.getMessage());


            } catch (IllegalArgumentException e) {
                System.out.println("Failed to Update the user : " + e.getMessage());


            } catch (Exception e) {
                System.out.println("Failed to reserve car : " + e.getMessage());
            }
            System.out.println("Printing results");
            System.out.println("****************************************************************");
            for (Passenger passenger : passengers) {
                passenger.display();
                System.out.println();
            }

        }catch (NullPointerException e) {

            System.out.println("Failed to print " + e.getMessage());

        }
    }



    }
