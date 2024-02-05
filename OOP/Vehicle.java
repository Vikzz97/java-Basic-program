 abstract class Vehicle {
    // Abstract class can be achieved by two methods
    // 1. Abstract class (0-100%)
    // 2. Interface (100%)

    abstract void start();
}
class Car extends Vehicle{

    void start(){
        System.out.println("car is started");
    }
}
class Scooter extends Vehicle{
    
    void start(){
        System.out.println("scooter is started");
    }
    public static void main(String[] args) {
        Car c = new Car();
        c.start();

        Scooter s = new Scooter();
        s.start();
    }
}
