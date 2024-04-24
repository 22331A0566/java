class Vehicle {
  public void start() {
    System.out.println("Vehicle starting...");
  }
}

class Car extends Vehicle {
  public void start(int count) {
    System.out.println("Starting " + count + " Cars...");
  }
}

public class Main {
  public static void main(String[] args) {
    Vehicle vehicle = new Vehicle();
    vehicle.start(); // Prints "Vehicle starting..."

    Car car = new Car();
    car.start(); // Prints "Vehicle starting..."
    car.start(3); // Prints "Starting 3 Cars..."
  }
}
