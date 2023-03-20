package DerivedClassChallengeOne;

public class Vehicle{
    private String speed;
    private String model;
    // solo necesitamos probar añadir un elemento desde la clase hija por lo que
    // pasamos el constructo default con valores del padre.
    public Vehicle(){
        speed = "100";
        model = "Tesla";
    }
    public String getSpeed() {
        return speed;
    }

    public String getModel() {
        return model;
    }
}
class Car extends Vehicle {

    private String name;
    public Car() {
        name = "";
    }
    public void setDetails(String name) {
        this.name = name;
    }
    public String getDetails(String carName) {
        String details = carName + ", " + getModel() + ", " + getSpeed();
        return details;
    }
}
class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1.getDetails("X"));
    }
}
