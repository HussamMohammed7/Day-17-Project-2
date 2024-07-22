public class Car {

    private String code;
    private Route fixed_route;
    private int max_capacity;


    public Car() {

    }

    public Car(String code, Route fixed_route, int max_capacity) {
        this.code = code;
        this.fixed_route = fixed_route;
        this.max_capacity = max_capacity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Route getFixed_route() {
        return fixed_route;
    }

    public void setFixed_route(Route fixed_route) {
        this.fixed_route = fixed_route;
    }

    public int getMax_capacity() {
        return max_capacity;
    }

    public void setMax_capacity(int max_capacity) {
        this.max_capacity = max_capacity;
    }


}
