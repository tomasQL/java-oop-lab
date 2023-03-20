package challengeTwo;
// Calling a constructor from another constructor
class Car {
    private String carName;
    private String carModel;
    private String carCapacity;

    //Default constructor
    public Car(){
        this.carName = "";
        this.carModel = "";
        this.carCapacity = "";
    }

    //Parameterized Constructor 1
    public Car(String name, String model){
        this.carName = name;
        this.carModel = model;
    }

    //Parameterized Constructor 2 (calls another constructor 1)
    public Car(String name, String model, String capacity){
        this(name, model);
        this.carCapacity = capacity;
    }

    public String getDetails(){
        return this.carName + ", " + this.carModel + ", " + this.carCapacity;
    }
}
class CarTest {
    public static void main(String[] args) {
        Car car = new Car("Ferrari","F8","100");
        System.out.println(car.getDetails());
    }
}